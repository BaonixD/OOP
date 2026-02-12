public class task5 {
    public static void main(String[] args) {
        double balance = 1000.0;
        double interestRate = 15.0;

        double newBalance = balance + (balance * (interestRate / 100));

        System.out.println("Initial Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("New Balance: " + newBalance);
    }
}