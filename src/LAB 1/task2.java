import java.util.Scanner;

public class task2 {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.println( "San engiz: " );
        double x = input.nextDouble();

        double area = x * x;
        double perimetr = x * 4;
        double diagonal = x * Math.sqrt(x);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimetr);
        System.out.println("Diagonal length: " + diagonal);

    }

}