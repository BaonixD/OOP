package lab2.problem4;

public abstract class Circuit {
    public abstract double getResistance();
    public abstract double getPotentialDiff();
    public abstract void applyPotentialDiff(double V);

    public double getPower() {
        // P = V^2 / R
        return Math.pow(getPotentialDiff(), 2) / getResistance();
    }

    public double getCurrent() {
        // I = V / R
        return getPotentialDiff() / getResistance();
    }
}