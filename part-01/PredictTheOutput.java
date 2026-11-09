public class PredictTheOutput {
    public static void main(String[] args) {
        System.out.println(10 + 20 + "Java");// 30Java
        System.out.println("Java" + 10 + 20);// Java1020
        System.out.println("Java" + (10 + 20));// Java30
        System.out.println(1 + 2 + "3" + 4 * 5);// 3320
        System.out.println("" + 7 + 3);// 73
        System.out.println(7 + 3 + "");// 10
        System.out.println(7 / 2);// 3
        System.out.println(7.0 / 2);// 3.5
        System.out.println(7 % 2);// 1
        System.out.print("A");// AB
        System.out.println("B");// CD E <---- sorry i forgot\n mb
        System.out.print("C\n");// d starts on new line because of \n
        System.out.println("D\tE");
    }
}
