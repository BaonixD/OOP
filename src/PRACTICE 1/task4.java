import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();

        double D = b * b - 4 * a * c;

        if (D < 0) {
            System.out.println("Error: Discriminant is negative (" + D + "), no real roots.");
        } else {
            double sqrtD = Math.sqrt(D);
            double denominator = 2 * a;

            double x1 = (-b + sqrtD) / denominator;
            double x2 = (-b - sqrtD) / denominator;

            System.out.println("Root 1: " + x1);
            System.out.println("Root 2: " + x2);
        }
    }
}