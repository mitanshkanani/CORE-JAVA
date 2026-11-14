import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks=sc.nextInt();
        if(marks>90){
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
