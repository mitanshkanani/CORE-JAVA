import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.Scanner;

import javax.naming.NameAlreadyBoundException;
/**
 * Description========================================
 * Create a password storage utility using the MessageDigest, SecureRandom and
 * HexFormat
 * classes. Passwords must never be stored as plain text.
 * Requirements================================================================================
 * 1. Create a class PasswordVault that stores up to 10 users (username and
 * stored hash).
 * Show a menu: 1. Register, 2. Login, 3. Exit.
 * 2. Register: accept a username and a password from the user. Reject a
 * username that
 * already exists.
 * 3. Validate the password: at least 8 characters, with at least one uppercase
 * letter, one
 * lowercase letter, one digit and one special character. If it fails, throw a
 * checked
 * WeakPasswordException whose message lists every rule that failed.
 * 4. Generate a random 16-byte salt using SecureRandom.
 * 5. Hash the salt bytes followed by the password bytes (UTF-8) using
 * MessageDigest with
 * the SHA-256 algorithm.
 * 6. Convert the salt and the hash to hex using HexFormat and store them for
 * that user as one
 * String: salt:hash.
 * 7. Login: accept a username and password. Split the stored String at :, hash
 * the entered
 * password with the stored salt, and compare the two hashes using
 * MessageDigest.isEqual(). Display “Login successful” or “Wrong password”.
 * 8. Throw a checked UserNotFoundException for an unknown username. After 3
 * wrong
 * passwords in a row, lock the user: every later login for that user throws
 * AccountLockedException.
 * 9. Wrap NoSuchAlgorithmException in an IllegalStateException (Section 5.1).
 * Only the
 * menu catches and prints exceptions; the program must never crash.
 * 10. Register two users with the same password and display both stored Strings
 * to show they
 * are different.
 * Core Java Training · Bonus: Reading the Java API Docs
 * 11. Stretch: replace SHA-256 with PBKDF2WithHmacSHA256 using SecretKeyFactory
 * and
 * PBEKeySpec, with 100,000 iterations and a 256-bit key.
 * PasswordVault
 */
class SizeException extends Exception {
    SizeException(String message) {
        super(message);
    }
}

class User {
    public String name;
    public String passwordhash;

    public User(String name, String hash) {
        this.name = name;
        this.passwordhash = hash;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class PasswordVault {

    private ArrayList<User> data = new ArrayList<>();// we will store 10 data here
    private final SecureRandom random = new SecureRandom();

    public void checkPassword(String pass) throws SizeException {
        if (pass.length() < 8) {
            throw new SizeException("PassWord Length shold be atleast 8");
        }
        // now we will check other things
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigits = false;
        boolean hasSpec = false;
        for (int i = 0; i < pass.length(); i++) {
            char c = pass.charAt(i);
            if (Character.isUpperCase(c)) {
                hasUpper = true;
                continue;
            }
            if (Character.isLowerCase(c)) {
                hasLower = true;
                continue;
            }
            if (Character.isDigit(c)) {
                hasDigits = true;
                continue;
            }
            if (!Character.isLetterOrDigit(c)) {
                hasSpec = true;
                continue;
            }
        }
        if (!hasUpper) {
            throw new SizeException("Your password doesnot have UPPER character");
        } else if (!hasLower) {
            throw new SizeException("Your password doesnot have lower character");
        } else if (!hasSpec) {
            throw new SizeException("Your PassWord doesnot have Special Charater");
        } else if (!hasDigits) {
            throw new SizeException("Your password doesot have digits");
        }
    }

    public String hash(byte[] salt, String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(salt); // 1. salt in
            md.update(password.getBytes(StandardCharsets.UTF_8)); // 2. password in
            byte[] hash = md.digest(); // 3. finish -> 32 bytes
            HexFormat hex = HexFormat.of();
            return hex.formatHex(salt) + ":" + hex.formatHex(hash); // 4. bytes -> text
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("SHA-256 not available", e);
        }
    }

    // used by register: new random salt every time
    public String hashNewPassword(String password) {
        byte[] salt = new byte[16];
        random.nextBytes(salt);
        return hash(salt, password);
    }

    public void register(String name, String password)
            throws SizeException, NameAlreadyBoundException, NoSuchAlgorithmException {
        if (data.size() >= 10) {
            throw new SizeException("Space is full");
        }
        for (User u : data) {
            if (u.getName().equals(name)) { // equals, not == (Strings, Part 6)
                throw new NameAlreadyBoundException("UserName Already Exist");
            }
        }
        checkPassword(password);
        // NOW WE DO SALTING AND ALL
        String hexend = hashNewPassword(password);
        User person = new User(name, hexend);// we will check and send the password but for now and we will pass hash
        data.add(person);
    }


    public User checkUser(String name) throws SizeException{
        for (User u : data) {
            if (u.name.equals(name)) {
                return u;
            }
        }
        throw new SizeException("No user found");
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        PasswordVault vault = new PasswordVault();// object required for anything because register is non static
        do {
            System.out.println("1.Register \n2.Login  \n3.Exit");
            if (sc.hasNextInt()) {
                int choice = sc.nextInt();
                sc.nextLine();// to empty the space
                if (choice == 1) {
                    // REGISTER'S STUFF
                    System.out.println("Enter USERNAME:");
                    String name = sc.next();
                    System.out.println("Enter PASSWORD:");
                    String password = sc.next();
                    try {
                        vault.register(name, password);
                        System.out.println("Your password"+vault.data.get(vault.data.size()-1).passwordhash);
                        
                    } catch (Exception e) {
                        // TODO: handle exception
                    }

                } else if (choice == 2) {
                    // LOGIN'S STUFF
                    System.out.println("Enter USERNAME:");
                    String name = sc.next();
                    System.out.println("Enter PASSWORD:");
                    String password = sc.next();
                    try {
                        User guy=vault.checkUser(name);
                        System.out.println(guy.name);
                        System.out.println(guy.passwordhash);
                    } catch (Exception e) {
                        // TODO: handle exception
                    }
                } else if (choice == 3) {
                    System.out.println("Bye!!");
                    break;
                } else {
                    System.out.println("Enter a valid choice!!!!");
                }
            } else {
                sc.nextLine();
                System.out.println("Enter Proper Value");
            }
        } while (true);
        sc.close();
    }
}
