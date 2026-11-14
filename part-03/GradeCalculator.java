import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=0;
        System.out.println("Enter marks: ");
        do{
            if (sc.hasNextInt()) {
                int val=sc.nextInt();
                if(val>=0 && val<=100){
                    marks=val;
                    break;
                }else{
                    System.out.println("Enter valid marks");
                }
            }else{
                System.out.println("Enter a number "+ sc.next()+" is not a number");
            }
        }while(true);

        if(marks>90 && marks<=100){
            System.out.println("Grade:A");
        }else if(marks>75){
            System.out.println("Grade:B");
        }else if (marks>60) {
            System.out.println("Grade:C");
        }else if(marks >40){
            System.out.println("Grade:D");
        }else if (marks >=0) {
            System.out.println("Grade:F");
        }else{
            System.out.println("Invalid Marks");
        }

        System.out.println("Result:"+ (marks>40? "Pass":"Fail"));
        sc.close();
    }
}
