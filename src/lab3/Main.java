package lab3;

import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Testing Task #5 (Chocolate Sort) ---");
        Chocolate[] chocolates = {
                new Chocolate("Twix", 50.5),
                new Chocolate("Snickers", 55.0),
                new Chocolate("Mars", 45.2)
        };
        Sort.bubbleSort(chocolates);
        System.out.println("Sorted chocolates: " + Arrays.toString(chocolates));

        System.out.println("\n--- Testing Task #4 (Employee & Manager) ---");
        Employee e1 = new Employee("Alice", 5000, new Date(), "INS1");
        Employee e2 = new Employee("Bob", 4000, new Date(), "INS2");
        Manager m1 = new Manager("Charlie", 5000, new Date(), "INS3", 500);

        Employee[] staff = {e1, e2, m1};
        Sort.bubbleSort(staff);
        System.out.println("Sorted staff by salary: " + Arrays.toString(staff));

        System.out.println("\n--- Testing Task #3 (MyCollection) ---");
        MyCollection<String> myCol = new MyArrayList<>();
        myCol.add("Java");
        myCol.add("OOP");
        System.out.print("Collection elements: ");
        for (String s : myCol) {
            System.out.print(s + " ");
        }
        System.out.println("\nSize: " + myCol.size());
    }
}