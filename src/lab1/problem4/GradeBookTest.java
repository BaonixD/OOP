package lab1.problem4;

import java.util.Scanner;

public class GradeBookTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Course oop = new Course("CS101 Object-oriented Programming and Design", "Core course", 3, "None");
        GradeBook gb = new GradeBook(oop);

        gb.displayMessage();
        System.out.println("Please, input grades for students (type 'stop' to finish):");

        int count = 1;
        while (true) {
            System.out.print("Student " + (char)('A' + (count-1)) + ": ");
            if (!sc.hasNextInt()) break; // Выход, если ввели не число

            int grade = sc.nextInt();
            Student s = new Student("Student " + (char)('A' + (count-1)), "id:" + count);
            s.setGrade(grade);
            gb.addStudent(s);
            count++;
        }

        System.out.println();
        gb.displayGradeReport();
    }
}