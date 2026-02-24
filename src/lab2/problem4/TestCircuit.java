package lab2.problem4;

public class TestCircuit {
    public static void main(String[] args) {
        Circuit a = new Resistor(3.0);
        Circuit b = new Resistor(3.0);
        Circuit c = new Resistor(6.0);
        Circuit d = new Resistor(3.0);
        Circuit e = new Resistor(2.0);

        Circuit f = new Series(a, b);     // 3 + 3 = 6.0
        Circuit g = new Parallel(c, d);   // (6*3)/(6+3) = 2.0
        Circuit h = new Series(g, e);     // 2 + 2 = 4.0

        Circuit circuit = new Parallel(h, f); // (4*6)/(4+6) = 2.4

        double R = circuit.getResistance();
        System.out.println("Equivalent Resistance: " + R + " Ohms"); // Должно быть 2.4

        // Попробуем подать напряжение 12 вольт
        circuit.applyPotentialDiff(12.0);
        System.out.println("Total Power: " + circuit.getPower() + " Watts");
        System.out.println("Total Current: " + circuit.getCurrent() + " Amps");
    }
}