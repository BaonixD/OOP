package lab2.problem5;

public class PhDStudent extends Person {
    private String topic;

    public PhDStudent(String n, int a, String topic) {
        super(n, a);
        this.topic = topic;
    }

    @Override
    public String getOccupation() {
        return "PhD: " + topic;
    }

    @Override
    public boolean assignPet(Animal p) {
        if (p instanceof Dog) {
            System.out.println(">>> System Message: PhD Student " + name + " cannot take a dog!");
            return false; // Отказ
        }
        this.pet = p;
        return true;
    }
}