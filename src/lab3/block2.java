package lab3;

import java.util.Date;
import java.util.Objects;
import java.util.Vector;

class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return Objects.equals(name, person.name);
    }
}

class Employee extends Person implements Comparable<Employee>, Cloneable {
    protected double salary;
    protected Date hireDate;
    protected String insuranceNumber;

    public Employee(String name, double salary, Date hireDate, String insuranceNumber) {
        super(name);
        this.salary = salary;
        this.hireDate = hireDate;
        this.insuranceNumber = insuranceNumber;
    }

    @Override
    public int compareTo(Employee other) {
        return Double.compare(this.salary, other.salary);
    }

    @Override
    public String toString() {
        return String.format("Employee[name=%s, salary=%.1f, hired=%tD]", name, salary, hireDate);
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        if (this.hireDate != null) {
            cloned.hireDate = (Date) this.hireDate.clone();
        }
        return cloned;
    }
}

class Manager extends Employee {
    private Vector<Employee> team = new Vector<>();
    private double bonus;

    public Manager(String name, double salary, Date hireDate, String insNum, double bonus) {
        super(name, salary, hireDate, insNum);
        this.bonus = bonus;
    }

    public void addToTeam(Employee e) {
        team.add(e);
    }

    @Override
    public int compareTo(Employee other) {
        int res = super.compareTo(other);
        if (res == 0 && other instanceof Manager manager) {
            return Double.compare(this.bonus, manager.bonus);
        }
        return res;
    }
}

public class block2 {
    public static void main(String[] args) {
        try {
            Employee e1 = new Employee("Ivan", 50000, new Date(), "ID123");
            Manager m1 = new Manager("Oleg", 50000, new Date(), "ID456", 10000);

            System.out.println(e1);
            System.out.println(m1);

            // Проверка сравнения (Manager выше из-за бонуса при равной зп)
            System.out.println("Comparison result: " + m1.compareTo(e1));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}