package lab2.problem5;

public class Main {
    public static void main(String[] args) {
        Person john = new Employee("John", 30, "Engineer");
        Person alice = new PhDStudent("Alice", 26, "AI");
        Animal murka = new Cat("Murka", 5);
        Animal rex = new Dog("Rex", 3);

        PersonRegistry registry = new PersonRegistry();
        registry.addPerson(john);
        registry.addPerson(alice);

        System.out.println("1. Initial state (John gets Murka):");
        john.assignPet(murka);
        registry.showRegistry();

        System.out.println("2. John goes on vacation (Leaves Murka with Alice):");
        john.leavePetWith(alice);
        registry.showRegistry();

        System.out.println("3. John returns (Retrieves Murka):");
        john.retrievePetFrom(alice);
        registry.showRegistry();

        System.out.println("4. Testing PhD Constraint (John gets a dog and tries to leave it with Alice):");
        john.assignPet(rex); // Теперь у Джона есть и собака
        john.leavePetWith(alice);
        registry.showRegistry(); // Собака должна остаться у Джона
    }
}