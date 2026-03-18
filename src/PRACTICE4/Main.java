package PRACTICE4;

class Restaurant {
    // Полиморфизм: принимаем любой объект, реализующий CanHavePizza [cite: 21, 51]
    public void servePizza(CanHavePizza eater) {
        eater.eatPizza(); // [cite: 23]

        // Проверка типа объекта (instanceof) [cite: 24]
        if (eater instanceof Person) {
            ((Person) eater).processPayment(); // [cite: 25, 26]
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Restaurant delpapa = new Restaurant(); // [cite: 30]

        // Создаем объекты [cite: 8, 10]
        CanHavePizza myCat = new Cat();
        Student me = new Student("Ilyas", 3.8);

        delpapa.servePizza(myCat); // [cite: 30]
        delpapa.servePizza(me);
    }
}