import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("Enter a positive number:");
        do{
            if(sc.hasNextInt()){
                
                num=sc.nextInt();
                if (num>0) {
                    break;
                }else{
                    System.out.println("Enter a +ve number");
                }
            }
            else{
                System.out.println("Print Valid Number " +sc.next()+" is not a number");
            }
        }while(true);

        System.out.println("Number is :"+num);

        int dummy=num;
        int digits_count=0;
        int rev=0;
        int arm=0;
        int sum=0;
        while (dummy>0) {
            int digit=dummy%10;
            digits_count++;//digits count
            sum+=digit;//total sum
            rev=rev*10+digit;//reverse
            arm=arm+digit*digit*digit;
            dummy=dummy/10;
        }
        System.out.println("Digits: "+digits_count);
        System.out.println("Digit sum: "+sum);
        System.out.println("Reverse: "+rev);
        if (rev==num) {
            System.out.println("Palindrome: True");
        }else{
            System.out.println("Palindrome:false");
        }
        //prime i am skipping
        if (arm==num) {
            System.out.println("Armstron :true");
        }else{
            System.out.println("Armstrong :false");
        }


    }
}
