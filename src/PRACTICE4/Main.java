package PRACTICE4;

class Restaurant {
    // Полиморфизм: принимаем любой объект, реализующий CanHavePizza
    public void servePizza(CanHavePizza eater) {
        eater.eatPizza(); // [cite: 23]


        if (eater instanceof Person) {
            ((Person) eater).processPayment();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant();

        // Создаем объекты [cite: 8, 10]
        CanHavePizza myCat = new Cat();
        Student me = new Student("Ilyas", 3.8);

        delpapa.servePizza(myCat);
        delpapa.servePizza(me);
    }
}