package PRACTICE4;

public abstract class Animal {
    void breath() { System.out.println("Breathing..."); }
}

// Кот — это животное, которое тоже может есть пиццу
class Cat extends Animal implements CanHavePizza {
    @Override
    public void eatPizza() {
        System.out.println("Cat is eating pizza.");
    }
}