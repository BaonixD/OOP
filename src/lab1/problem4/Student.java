package lab1.problem4;

public class Student {
    private String name;
    private String id;
    private int grade;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public int getGrade() { return grade; }
    public void setGrade(int grade) { this.grade = grade; }
    public String getName() { return name; }

    @Override
    public String toString() {
        // Обязательная реализация toString
        return name + ", id: " + id;
    }
}