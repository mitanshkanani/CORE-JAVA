public class Receipt {
    public static void main(String[] args) {
        System.out.printf("=============================================%n");
        System.out.printf("ITEM                QTY      PRICE      TOTAL%n");
        System.out.printf("=============================================%n");
        System.out.printf("Notebook              %d      %.2f     %.2f%n", 3, 45.50, 136.50);
        System.out.printf("Notebook              %d     %.2f     %.2f%n", 10, 10.00, 100.00);
        System.out.printf("Notebook              %d     %.2f     %.2f%n", 1, 599.99, 599.99);
        System.out.printf("---------------------------------------------%n");
        System.out.printf("GRAND TOTAL                           %.2f%n", 836.49);
        System.out.printf("=============================================%n");

    }
}
