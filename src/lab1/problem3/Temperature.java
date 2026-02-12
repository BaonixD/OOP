package lab1.problem3;

public class Temperature {
    // Приватные поля: доступ только через методы
    private double value;
    private char scale;



    // 1. Дефолтный: 0 градусов Цельсия
    public Temperature() {
        this.value = 0;
        this.scale = 'C';
    }

    // 2. Только значение (по умолчанию Цельсий)
    public Temperature(double value) {
        this.value = value;
        this.scale = 'C';
    }

    // 3. Только шкала (по умолчанию 0 градусов)
    public Temperature(char scale) {
        this.value = 0;
        this.scale = scale;
    }

    // 4. Оба параметра
    public Temperature(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

    // --- Методы возврата (Accessors) ---

    // Возвращает градусы в Цельсиях
    public double getCelsius() {
        if (scale == 'C') return value;
        return 5 * (value - 32) / 9; // Формула из задания
    }

    // Возвращает градусы в Фаренгейтах
    public double getFahrenheit() {
        if (scale == 'F') return value;
        return (9 * value / 5) + 32; // Формула из задания
    }

    // Возвращает текущую шкалу
    public char getScale() {
        return scale;
    }

    //  Mutators

    public void setValue(double value) {
        this.value = value;
    }

    public void setScale(char scale) {
        this.scale = scale;
    }

    public void setAll(double value, char scale) {
        this.value = value;
        this.scale = scale;
    }

}