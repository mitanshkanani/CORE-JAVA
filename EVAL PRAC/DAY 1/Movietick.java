import java.util.Scanner;

public class Movietick {
    public static double calculator(int age,String seat,int num_of_ticket,int day_no){
        double basePrice=0;
        //3.  Use a switch statement to set the base price per ticket: S = ₹150, P = ₹250, R = ₹400.
        switch (seat) {
            case "S":
                basePrice=150.00;
                break;
            case "P":
                basePrice=250.00;
                break;
            case "R":
                basePrice=400.00;
                break;
        }
        if (age<12) {
            double concession=(50*basePrice)/100;
            basePrice-=concession;
        }
        if (age>=60) {
            double concession=(30*basePrice)/100;
            basePrice-=concession;
        }
        basePrice*=num_of_ticket;
        if (num_of_ticket>=5) {
            double discount=(10*basePrice)/100;
            basePrice-=discount;
        }
        if (day_no==6 || day_no==7) {
            basePrice+=50*num_of_ticket;
        }
        return basePrice;
    }

    public static void main(String[] args) {
        // 1. Accept the customer name, age, seat type (S, P or R), number of tickets
        // and day number (1 =Monday ... 7 = Sunday).
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE NAME:");
        String name = sc.next();
        System.out.println("ENTER AGE:");
        int age = sc.nextInt();
        if (age <= 1 || age >= 120) {
            System.out.println("Rejected:INVALID AGE");
            System.exit(0);
        }
        String seat;
            System.out.print("Enter seat type (S/P/R): ");
            seat = sc.next().toUpperCase();
        if(!seat.equals("S") && !seat.equals("P") && !seat.equals("R")){
            System.out.println("Rejected:INVALID SEAT TYPE");
            System.exit(0);
        }

        System.out.println("ENTER THE NUMBER OF SEATS:");
        int num_of_ticket = sc.nextInt();
        if (num_of_ticket < 1 || num_of_ticket > 10) {
            System.out.println("Rejected:INVALID AMOUNT OF TICKET");
            System.exit(0);
        }
        System.out.println("DAY NUMBER FOR THE TICKET:");
        int day_no = sc.nextInt();
        if (day_no < 1 || day_no > 7) {
            System.out.println("Rejected: INVALID DAY OF WEEK");
            System.exit(0);
        }
        System.out.println("================================");
        System.out.println("NAME:" + name + "\nAGE:" + age + "\nSEAT TYPE:" + seat + "\nNO.OF TICK:" + num_of_ticket
                + "\nDAY NO:" + day_no);
        sc.close();

        double amount=calculator(age, seat, num_of_ticket, day_no);
        System.out.println("\nAmount"+amount);
        
    }
}
