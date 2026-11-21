public class BankPassbook {
    static final double OPENING_BALANCE = 5000;
    static final double LOW_BALANCE_LIMIT = 1000;

    public static void main(String[] args) {
        char[] types = {'D', 'W', 'W', 'D', 'D', 'W', 'W', 'D', 'W', 'W'};
        double[] amounts = {2000, 1500, 9000, 3000, 500, 12000, 2500, 1000, 4000, 3000};

        String error = validate(types, amounts);
        if (error != null) {
            System.out.println("Invalid input: " + error);
            return;
        }

        double[] trail = buildBalanceTrail(types, amounts);

        System.out.println("Opening balance      : " + OPENING_BALANCE);
        System.out.println("Final balance        : " + trail[trail.length - 1]);
        System.out.println("Failed withdrawals   : " + countFailedWithdrawals(types, trail));
        System.out.println("Total fees charged   : " + totalFees(types, amounts, trail));
        System.out.println("Highest balance      : " + highestBalance(trail)
                + " (after transaction " + highestBalanceTransaction(trail) + ")");
        System.out.println("First below " + LOW_BALANCE_LIMIT + "  : transaction "
                + firstTransactionBelow(trail, LOW_BALANCE_LIMIT));
        System.out.printf("Average balance      : %.2f%n", averageBalance(trail));
    }

    static String validate(char[] types, double[] amounts) {
        // TODO 1: return null when the input is valid, otherwise a message describing the first problem.
        //         Check: equal array lengths, type must be 'D' or 'W', amount must be positive.
        return null;
    }

    static double fee(double amount) {
        // TODO 2: withdrawal fee.
        //         amount up to 2000 -> 5, above 2000 and up to 10000 -> 15, above 10000 -> 0.5% of the amount.
        return 0;
    }

    static double[] buildBalanceTrail(char[] types, double[] amounts) {
        // TODO 3: process the transactions in order, exactly once, starting from OPENING_BALANCE.
        //         A deposit adds the amount. A withdrawal needs (amount + fee) <= balance, otherwise it is
        //         rejected and the balance stays the same. Store the balance after every transaction.
        return new double[types.length];
    }

    static int countFailedWithdrawals(char[] types, double[] trail) {
        // TODO 4: count rejected withdrawals. Do not recalculate balances; read the trail only.
        return 0;
    }

    static double totalFees(char[] types, double[] amounts, double[] trail) {
        // TODO 5: total fees of the withdrawals that were accepted (rejected ones pay no fee).
        return 0;
    }

    static double highestBalance(double[] trail) {
        // TODO 6: highest balance after any transaction (single traversal, no sorting).
        return 0;
    }

    static int highestBalanceTransaction(double[] trail) {
        // TODO 7: 1-based number of the first transaction after which the highest balance was reached.
        return 0;
    }

    static int firstTransactionBelow(double[] trail, double limit) {
        // TODO 8: 1-based number of the first transaction after which the balance is below the limit, or -1.
        return 0;
    }

    static double averageBalance(double[] trail) {
        // TODO 9: average of the balances in the trail.
        return 0;
    }
}
