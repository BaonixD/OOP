package lab2.problem5;
import java.util.ArrayList;

public class PersonRegistry {
    private ArrayList<Person> people = new ArrayList<>();

    public void addPerson(Person p) { people.add(p); }
    public void removePerson(Person p) { people.remove(p); }

    public void showRegistry() {
        System.out.println("--- Registry ---");
        for (Person p : people) {
            System.out.println(p.toString());
        }
        System.out.println("----------------\n");
    }
}