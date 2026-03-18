package PRACTICE4;

public abstract class Animal {
    void breath() { System.out.println("Breathing..."); } // [cite: 7]
}

// Кот — это животное, которое тоже может есть пиццу [cite: 42, 43]
class Cat extends Animal implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("Cat is eating pizza."); // [cite: 13]
    }
}