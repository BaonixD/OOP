package lab2.problem5;

public abstract class Person {
    protected String name;
    protected int age;
    protected Animal pet;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public boolean hasPet() { return pet != null; }
    public void removePet() { this.pet = null; }
    public abstract String getOccupation();

    // Возвращает true, если получилось взять питомца
    public boolean assignPet(Animal p) {
        this.pet = p;
        return true;
    }

    public void leavePetWith(Person other) {
        if (this.hasPet() && other.assignPet(this.pet)) {
            this.removePet();
        }
    }

    public void retrievePetFrom(Person other) {
        if (other.hasPet() && this.assignPet(other.pet)) {
            other.removePet();
        }
    }

    @Override
    public String toString() {
        return name + " [" + getOccupation() + "] -> " + (hasPet() ? pet.toString() : "No pet");
    }
}