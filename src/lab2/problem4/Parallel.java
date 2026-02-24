package lab2.problem4;

public class Parallel extends Circuit {
    private Circuit c1, c2;

    public Parallel(Circuit c1, Circuit c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public double getResistance() {
        double r1 = c1.getResistance();
        double r2 = c2.getResistance();
        return (r1 * r2) / (r1 + r2);
    }

    @Override
    public double getPotentialDiff() {
        // В параллельной цепи напряжение везде одинаковое
        return c1.getPotentialDiff();
    }

    @Override
    public void applyPotentialDiff(double V) {
        // Напряжение на ветвях равно входному напряжению
        c1.applyPotentialDiff(V);
        c2.applyPotentialDiff(V);
    }
}