package lab2.problem3;

public class CheckingAccount extends Account {
    private int transactionCount = 0;
    private static final int FREE_TRANSACTIONS = 3; // Например, 3 бесплатные
    private static final double TRANSACTION_FEE = 0.02;

    public CheckingAccount(int a) {
        super(a);
    }

    @Override
    public void deposit(double sum) {
        super.deposit(sum);
        transactionCount++;
        deductFee();
    }

    @Override
    public void withdraw(double sum) {
        super.withdraw(sum);
        transactionCount++;
        deductFee();
    }

    private void deductFee() {
        if (transactionCount > FREE_TRANSACTIONS) {
            super.withdraw(TRANSACTION_FEE);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " [Checking, Transactions: " + transactionCount + "]";
    }
}