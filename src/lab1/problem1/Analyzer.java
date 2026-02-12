package lab1.problem1;
import java.util.Scanner;

public class Analyzer {

    public static void main(String[] args) {
        Data data = new Data();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number (Q to quit): ");


            String input = scanner.next();


            if (input.equals("Q")) {
                break;
            }

            try {
                // Пытаемся превратить строку в число
                double value = Double.parseDouble(input);
                data.addValue(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number or 'Q'.");
            }
        }


        System.out.println("Average = " + data.getAverage());
        System.out.println("Maximum = " + data.getLargest());

        scanner.close();
    }
}