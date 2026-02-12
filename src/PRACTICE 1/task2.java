import java.util.Scanner;

public class task2 {

    public static void main ( String[] args ) {

        Scanner input = new Scanner(System.in);

        System.out.println( "San engiz: " );
        double x = input.nextDouble();


        double area = x * x;
        double perimetr = x * 4;
        double diagonal = x * Math.sqrt(x);

        if ( Double.isInfinite(area) ) {
            System.out.println("шексыз");
        } else{
            System.out.println(area);
        }

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimetr);
        System.out.println("Diagonal length: " + diagonal);

    }

}