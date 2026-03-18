package PRACTICE4;

public class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public void processPayment() {
        System.out.println("Processing payment for " + name); // [cite: 26]
    }
}

class Student extends Person implements CanHavePizza, Movable, CanHaveParty, CanHaveRetake {
    double gpa;

    public Student(String name, double gpa) {
        super(name);
        this.gpa = gpa;
    }

    @Override
    public void eatPizza() {
        System.out.println(name + " (Student) is eating pizza."); // [cite: 15]
    }

    @Override
    public void move() { System.out.println(name + " is moving."); } // [cite: 37]

    @Override
    public void dance() { System.out.println(name + " is dancing."); }

    @Override
    public void reviewMaterial() {
        System.out.println(name + " is preparing for a retake.");
    }
}