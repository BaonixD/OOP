package lab1.problem3;

public class TestProblem3 {
    public static void main(String[] args) {
        // 1. Проверка дефолтного конструктора (должно быть 0.0 C)
        Temperature t1 = new Temperature();
        System.out.println("T1 (Default): " + t1.getCelsius() + " " + t1.getScale());

        // 2. Проверка конструктора только со значением (по умолчанию С)
        Temperature t2 = new Temperature(36.6);
        System.out.println("T2 (Value only): " + t2.getCelsius() + " " + t2.getScale());

        // 3. Проверка конструктора только со шкалой  тек F беремыз по дефолту а дальше прогграмма сама (по умолчанию 0.0)
        Temperature t3 = new Temperature('F');
        System.out.println("T3 (Scale only): " + t3.getFahrenheit() + " " + t3.getScale());
        // Проверим конвертацию 0 F в Цельсий
        System.out.println("T3 in Celsius: " + t3.getCelsius() + " C");

        // 4. Проверка конструктора с обоими параметрами
        Temperature t4 = new Temperature(100, 'C');
        System.out.println("T4 (Full): " + t4.getCelsius() + " " + t4.getScale());
        // Проверим конвертацию точки кипения в Фаренгейты (должно быть 212)
        System.out.println("T4 in Fahrenheit: " + t4.getFahrenheit() + " F");

        // 5. Проверка методов установки (Mutators)
        t1.setAll(50, 'F');
        System.out.println("\nT1 after setAll(50, 'F'):");
        System.out.println("Celsius: " + t1.getCelsius());
        System.out.println("Fahrenheit: " + t1.getFahrenheit());
    }
}