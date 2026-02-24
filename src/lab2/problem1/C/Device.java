package lab2.problem1.C;
import java.util.Objects;

public class Device {
    private String brand;

    public Device(String brand) {
        this.brand = brand;
    }

    // Переопределяем equals: теперь объекты равны, если у них одинаковый бренд
    @Override
    public boolean equals(Object o) {
        if (this == o) return true; // Если это один и тот же адрес в памяти
        if (o == null || getClass() != o.getClass()) return false; // Если типы разные
        Device device = (Device) o;
        return Objects.equals(brand, device.brand); // Сравниваем само значение строки
    }

    // Переопределяем hashCode: генерируем число на основе бренда
    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }

    @Override
    public String toString() {
        return "Device: " + brand;
    }
}