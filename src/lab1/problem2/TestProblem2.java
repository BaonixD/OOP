package lab1.problem2;

public class TestProblem2 {
    public static void main(String[] args) {
        // Создаем объект банка (демонстрация конструктора и final поля)
        CurrencyConverter myBank = new CurrencyConverter("KBTU Bank");

        // 1. Проверяем перегрузку метода (deposit только с числом)
        myBank.deposit(1000.0);

        // 2. Проверяем вторую перегрузку (число + Enum)
        // Здесь сработает логика с exchangeFee (static поле)
        myBank.deposit(150.0, Currency.USD);

        // 3. Проверяем Read-only поле через геттер
        System.out.println("Final Balance: " + myBank.getBalance());

        // 4. Проверяем работу static метода
        CurrencyConverter.setExchangeFee(5.0);
        System.out.println("Global fee has been updated to 5.0%");
    }
}
