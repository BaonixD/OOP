package lab1.problem4;

import java.util.ArrayList;

public class GradeBook {
    private Course course;
    private ArrayList<Student> students;

    public GradeBook(Course course) {
        this.course = course;
        this.students = new ArrayList<>(); // Храним список студентов
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for " + course.getName() + "!");
    }

    public void displayGradeReport() {
        if (students.isEmpty()) return;

        double avg = determineClassAverage();
        Student low = getLowest();
        Student high = getHighest();

        System.out.printf("Class average is %.2f. ", avg);
        System.out.println("Lowest grade is " + low.getGrade() + " (" + low + ").");
        System.out.println("Highest grade is " + high.getGrade() + " (" + high + ").\n");

        outputBarChart();
    }

    public double determineClassAverage() {
        int sum = 0;
        for (Student s : students) sum += s.getGrade();
        return (double) sum / students.size();
    }

    private Student getLowest() {
        Student low = students.get(0);
        for (Student s : students) if (s.getGrade() < low.getGrade()) low = s;
        return low;
    }

    private Student getHighest() {
        Student high = students.get(0);
        for (Student s : students) if (s.getGrade() > high.getGrade()) high = s;
        return high;
    }

    public void outputBarChart() {
        System.out.println("Grades distribution:");
        int[] freq = new int[11];
        for (Student s : students) {
            int idx = s.getGrade() / 10;
            freq[Math.min(idx, 10)]++;
        }

        for (int i = 0; i < freq.length; i++) {
            if (i == 10) System.out.print("  100: ");
            else System.out.printf("%02d-%02d: ", i * 10, i * 10 + 9);

            for (int j = 0; j < freq[i]; j++) System.out.print("*");
            System.out.println();
        }
    }

    @Override
    public String toString() {
        return "GradeBook for " + course;
    }
}