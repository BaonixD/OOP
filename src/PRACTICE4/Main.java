package PRACTICE4;
import java.util.*;

class Restaurant {
    public void servePizza(CanHavePizza eater) {
        eater.eatPizza();
        if (eater instanceof Person) ((Person) eater).processPayment();
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        //  Тест полиморфизма (Кот и Студент)
        delpapa.servePizza(new Cat());
        Student s1 = new Student("Ilyas", 3.8);
        delpapa.servePizza(s1);

        // Тест сортировки по GPA (Comparable)
        List<Student> list = new ArrayList<>();
        list.add(s1);
        list.add(new Student("Arman", 3.2));
        list.add(new Student("Alua", 4.0));

        Collections.sort(list); // Сама вызывает твой compareTo

        System.out.println("\nSorted by GPA:");
        for (Student s : list) System.out.println(s.name + ": " + s.gpa);
    }
}