
import java.util.Scanner;

public class MiniAtm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("===== MINI ATM =====");
        int balance=10000;
        int trans=0;
        outer:
        do {
            System.out.println("1. Check balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
                int choice=sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Your Balance is:"+balance);
                        trans++;
                        break;
                    case 2:
                        System.out.println("Enter Deposite Amount:");
                        int Amount=sc.nextInt();
                        if (Amount>0) {
                            balance+=Amount;
                            trans++;
                        } else {
                            System.out.println("Enter valid Deposit Amout");
                        }
                        break;
                    case 3:
                        System.out.println("Enter withdraw amount:");
                        do {
                            if (sc.hasNextInt()) {
                                int value=sc.nextInt();
                                if (value>balance) {
                                    System.out.println("Not enough balance");
                                    break;
                                }else{
                                    if (value%100==0) {
                                        balance-=value;
                                        trans++;
                                    }else{
                                        System.out.println("Enter multiple of 100 to withdraw");
                                        break;
                                    }
                                    break;
                                }
                            } else {
                                sc.next();
                                System.out.println("Please enter a whole number");
                            }
                        } while (true);
                        break;
                    case 4:
                        System.out.println("Thank you!");
                        System.out.println("Transactions done:"+trans);
                        break outer;
                    default:
                        System.out.println("Invalid Option");
                        break;
                }

        } while (true);
        sc.close();
    }
}
