package lab2.problem3;

public class TestBank {
    public static void main(String[] args) {
        Bank myBank = new Bank();

        // 1. Инициализация счетов
        SavingsAccount savings = new SavingsAccount(101, 10.0); // 10% для наглядности
        CheckingAccount checking = new CheckingAccount(202);

        myBank.openAccount(savings);
        myBank.openAccount(checking);

        System.out.println("=== LOG: Accounts opened in the system ===");
        myBank.displayAccounts();
        System.out.println("------------------------------------------\n");

        // 2. Работа с SavingsAccount
        System.out.println("=== LOG: Processing SavingsAccount #101 ===");
        System.out.println("Action: Depositing $1000...");
        savings.deposit(1000);
        savings.print();

        System.out.println("Action: Running bank update (Adding Interest)...");
        myBank.update(); // Здесь сработает addInterest()
        savings.print();
        System.out.println("------------------------------------------\n");

        // 3. Работа с CheckingAccount
        System.out.println("=== LOG: Processing CheckingAccount #202 ===");
        System.out.println("Note: First 3 transactions are free. Fee is $0.02");

        System.out.print("Trans #1 (Dep $100): "); checking.deposit(100); checking.print();
        System.out.print("Trans #2 (With $20): "); checking.withdraw(20); checking.print();
        System.out.print("Trans #3 (Dep $50):  "); checking.deposit(50);  checking.print();

        System.out.println("Action: Next transaction should trigger fee...");
        System.out.print("Trans #4 (With $10): "); checking.withdraw(10); checking.print();
        System.out.println("------------------------------------------\n");

        // 4. Перевод между счетами
        System.out.println("=== LOG: Internal Transfer ===");
        double transferAmount = 300.0;
        System.out.println("Action: Transferring $" + transferAmount + " from #101 to #202...");

        savings.transfer(transferAmount, checking);

        System.out.println("\nFinal Bank State:");
        myBank.displayAccounts();
        System.out.println("==========================================");
    }
}