class Animal {
    private String name;

    public Animal() {
        this.name = "Unknown animal";
        System.out.println( "Parent constructor without parametrs called" );
    }

    public Animal ( String name ) {
        this.name = name;
        System.out.println( "Parent constructor with name '" + name + "' called." );
    }

    // Method to be Overridden in the subclass
    public void makeSound() {
        System.out.println("Animal makes a generic sound");
    }

    // Getter for the name
    public String getName() {
        return name;
    }
}


// subclass
class Dog extends Animal {

    // Constructor without parameters
    public Dog() {
        // Calling the parent's default constructor
        super();
        System.out.println("Dog created using super() without parameters");
    }

    // Constructor with parameters
    public Dog(String name) {
        // Calling the parent's parameterized constructor
        super(name);
        System.out.println("Dog created using super(name)");
    }


    @Override
    public void makeSound() {
        // Changing the behavior of the parent method
        System.out.println("Gav-Gav! (The dog is barking)");
    }

    //Demonstration of Method Overloading

    // No parameters
    public void eat() {
        System.out.println("Dog is eating generic dog food.");
    }

    // Same name, different parameter type (String)
    public void eat(String food) {
        System.out.println("Dog is eating " + food);
    }

    // Same name, different parameter type (int)
    public void eat(int amount) {
        System.out.println("Dog has eaten " + amount + " bowls of food today");
    }
}

public class Problem1 {
    public static void main(String[] args) {

        System.out.println("1. Testing Constructors and super()");
        // Creating a Dog object using the default constructor
        Dog dog1 = new Dog();

        System.out.println("--------------------------------------------------");

        // Creating a Dog object using the parameterized constructor
        Dog dog2 = new Dog("Rex");

        System.out.println("\n 2. Testing Method Overriding");
        // Calls the overridden method in Dog class, not Animal class
        dog2.makeSound();

        System.out.println("\n 3. Testing Method Overloading");
        // Calls different eat methods based on the arguments
        dog2.eat();                 // Calls eat()
        dog2.eat("Meat");           // Calls eat(String)
        dog2.eat(3);                // Calls eat(int)
    }
}