public class student {
    private String name;
    private int id;
    private int yearOfStudy;

    public student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 2;
    }

    // Метод void — он просто печатает в консоль
    public void printData() {
        System.out.println("Student: " + name + " ID: " + id + ", Year: " + yearOfStudy);
    }

    public void incrementYear() {
        this.yearOfStudy++;
    }

    public static void main(String[] args) {
        student s = new student("Ilyas", 1);
        s.printData();
        s.incrementYear();
        s.printData();

    }
}