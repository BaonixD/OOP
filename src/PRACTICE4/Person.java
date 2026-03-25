package PRACTICE4;
import java.util.*;


public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void processPayment() {
        System.out.println("Processing payment for " + name); // [cite: 26]
    }
}


class Student extends Person implements CanHavePizza, Movable, CanHaveParty, CanHaveRetake, Comparable<Student> {
    double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }


    @Override
    public int compareTo(Student other) {
        if (this.gpa > other.gpa) return 1;
        if (this.gpa < other.gpa) return -1;
        return 0;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " (Student) is eating pizza.");
    }

    @Override
    public void move() {
        System.out.println(name + " is moving.");
    }

    @Override
    public void dance() {
        System.out.println(name + " is dancing.");
    }

    @Override
    public void reviewMaterial() {
        System.out.println(name + " is preparing for a retake.");
    }

    // Полезно добавить toString, чтобы при выводе в консоль видеть данные, а не адрес в памяти
    @Override
    public String toString() {
        return "Student{name='" + name + "', gpa=" + gpa + "}";
    }
}