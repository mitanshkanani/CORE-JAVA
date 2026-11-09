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
        // so by default it removes the value after the . hence whatever it be even if it be 3.9 it will be 3 because values after the . are removed
    }
}
