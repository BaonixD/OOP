import java.util.Scanner;
import java.util.Vector;

class Person {
    private String name;
    private String address;

    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person[name=" + name + ",address=" + address + "]";
    }
}

class Student extends Person {
    private String program;
    private int year;
    private double fee;

    public Student(String name, String address, String program, int year, double fee) {
        super(name, address);
        this.program = program;
        this.year = year;
        this.fee = fee;
    }

    public String getProgram() {
        return program;
    }
    public void setProgram(String program) {
        this.program = program;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getFee() {
        return fee;
    }
    public void setFee(double fee) {
        this.fee = fee;
    }

    @Override
    public String toString() {
        return "Student[" + super.toString() + ",program=" + program + ",year=" + year + ",fee=" + fee + "]";
    }
}

class Staff extends Person {
    private String school;
    private double pay;

    public Staff(String name, String address, String school, double pay) {
        super(name, address);
        this.school = school;
        this.pay = pay;
    }

    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }
    public double getPay() {
        return pay;
    }
    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Staff[" + super.toString() + ",school=" + school + ",pay=" + pay + "]";
    }
}

public class Problem2 {
    public static void main(String[] args) {
        Vector<Person> database = new Vector<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Add Student");
            System.out.println("2. Add Staff");
            System.out.println("3. Show All");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scan.nextInt();
            scan.nextLine();

            if (choice == 1) {
                System.out.print("Name: ");    String name = scan.nextLine();
                System.out.print("Address: "); String addr = scan.nextLine();
                System.out.print("Program: "); String prog = scan.nextLine();
                System.out.print("Year: ");    int year = scan.nextInt();
                System.out.print("Fee: ");     double fee = scan.nextDouble();

                database.add(new Student(name, addr, prog, year, fee));

            } else if (choice == 2) {
                System.out.print("Name: ");    String name = scan.nextLine();
                System.out.print("Address: "); String addr = scan.nextLine();
                System.out.print("School: ");  String school = scan.nextLine();
                System.out.print("Pay: ");     double pay = scan.nextDouble();

                database.add(new Staff(name, addr, school, pay));

            } else if (choice == 3) {
                System.out.println("\n--- DATABASE ---");
                for (Person p : database) {
                    System.out.println(p.toString());
                }

            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            }
        }
        scan.close();
    }
}