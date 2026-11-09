public class ArgsCalculator {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.printf("%d + %d = %d %n", a, b, a + b);
        System.out.printf("%d - %d = %d %n", a, b, a - b);
        System.out.printf("%d * %d = %d %n", a, b, a * b);
        System.out.printf("%d / %d = %d %n", a, b, a / b);
        System.out.printf("%d %% %d = %d %n", a, b, a % b);
        // %.2f
        double a1 = Double.parseDouble(args[0]);
        double b1 = Double.parseDouble(args[1]);
        System.out.printf("%d / %d = %.2f%n", a, b, a1 / b1);
        // the integer version printed 3 because i think it uses .floor and rounds down
        // at less that 3.5 hence 3
    }
}
