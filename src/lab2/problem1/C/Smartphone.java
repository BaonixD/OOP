package lab2.problem1.C;

import java.util.Objects;

public class Smartphone extends Device {
    private String model;

    public Smartphone(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false; // Сначала проверяем бренд через родителя
        Smartphone that = (Smartphone) o;
        return Objects.equals(model, that.model); // Затем проверяем модель
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), model);
    }

    @Override
    public String toString() {
        return super.toString() + " (Model: " + model + ")";
    }
}