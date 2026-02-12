package lab1.problem2;

public class CurrencyConverter {

    // 1. общая коммисия
    private static double exchangeFee = 1.5;


    private final String bankName;


    private double balance;


    {
        this.balance = 0.0;
        System.out.println("LOG: New bank account created.");
    }


    public CurrencyConverter(String bankName) {
        this.bankName = bankName;
    }


    public void deposit(double amount) {
        this.balance += amount;
    }

    public void deposit(double amount, Currency currency) {
        double feeAmount = (amount * exchangeFee) / 100;
        double finalAmount = amount - feeAmount;


        this.deposit(finalAmount);
        System.out.println("Deposited " + finalAmount + " " + currency + " to " + this.bankName);
    }


    public double getBalance() {
        return balance;
    }


    public static void setExchangeFee(double newFee) {
        exchangeFee = newFee;
    }
}