package lab2.problem4;

public class Series extends Circuit {
    private Circuit c1, c2;

    public Series(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        return c1.getResistance() + c2.getResistance();
    }

    @Override
    public double getPotentialDiff() {
        // Напряжение на всей серии — это сумма напряжений компонентов
        return c1.getPotentialDiff() + c2.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        // 1. Находим общий ток: I = V / R_total
        double current = V / getResistance();
        // 2. Напряжение на каждом: V_n = I * R_n
        c1.applyPotentialDiff(current * c1.getResistance());
        c2.applyPotentialDiff(current * c2.getResistance());
    }
}