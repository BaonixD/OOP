import java.util.Scanner;


public class task3 {

    public static void main ( String[] args ) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter your garde: ");
        double grade = input.nextDouble();

        if (grade >= 95 && grade <= 100) System.out.println("Grade: A");
        else if (grade >= 90) System.out.println("Grade: A-");
        else if (grade >= 85) System.out.println("Grade: B+");
        else if (grade >= 80) System.out.println("Grade: B");
        else if (grade >= 75) System.out.println("Grade: B-");
        else if (grade >= 70) System.out.println("Grade: C+");
        else if (grade >= 65) System.out.println("Grade: C");
        else if (grade >= 60) System.out.println("Grade: C-");
        else if (grade >= 55) System.out.println("Grade: D+");
        else if (grade >= 50) System.out.println("Grade: D");
        else if (grade >= 0)  System.out.println("Grade: F");
        else System.out.println("Error: Invalid score");

    }

}