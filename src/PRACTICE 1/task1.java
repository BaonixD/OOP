import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println( "your name: " );
    String name = input.nextLine();

    String len = "-";
    len = len.repeat(name.length());

    System.out.println( "+" + len + "+" );
    System.out.println( "|" + name + "|" );
    System.out.println( "+" + len + "+" );


    }
}