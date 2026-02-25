package lab2.problem5;

public class Employee extends Person {
    private String job;

    public Employee(String n, int a, String job) {
        super(n, a);
        this.job = job;
    }

    @Override
    public String getOccupation() {
        return "Employee: " + job;
    }
}