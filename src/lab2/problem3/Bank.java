package lab2.problem3;

import java.util.Vector;

public class Bank {
    private Vector<Account> accounts = new Vector<>();

    public void openAccount(Account a) {
        accounts.add(a);
    }

    public void closeAccount(int accNumber) {
        accounts.removeIf(acc -> acc.getAccountNumber() == accNumber);
    }

    public void update() {
        for (Account a : accounts) {
            if (a instanceof SavingsAccount) {
                ((SavingsAccount) a).addInterest(); // Полиморфизм в действии
            } else if (a instanceof CheckingAccount) {
                // Комиссия в CheckingAccount уже снимается при транзакциях,
                // но тут можно добавить логику ежемесячного обслуживания
            }
        }
    }

    public void displayAccounts() {
        for (Account a : accounts) {
            a.print();
        }
    }
}