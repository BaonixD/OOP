package lab2.problem5;

public abstract class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public abstract String getSound();

    @Override
    public String toString() {
        return name + " (" + getClass().getSimpleName() + ")";
    }
}


class Cat extends Animal {
    public Cat(String n, int a) { super(n, a); }
    public String getSound() { return "Meow"; }
}

class Dog extends Animal {
    public Dog(String n, int a) { super(n, a); }
    public String getSound() { return "Woof"; }
}

class Bird extends Animal {
    public Bird(String n, int a) { super(n, a); }
    public String getSound() { return "Tweet"; }
}

class Fish extends Animal {
    public Fish(String n, int a) { super(n, a); }
    public String getSound() { return "Blub"; }
}