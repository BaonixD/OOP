public class student {

    private String name;
    private int id;
    private int yearOfStudy;

    // класс конструктор
    public student(String name, int id) {
        this.name = name;
        this.id = id;
        this.yearOfStudy = 2;
    }



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