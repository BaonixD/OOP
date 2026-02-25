package lab2.problem5;

public class Student extends Person {
    private String major;

    public Student(String n, int a, String major) {
        super(n, a);
        this.major = major;
    }

    @Override
    public String getOccupation() {
        return "Student: " + major;
    }
}