package lab3;
import java.util.*;
public interface block1 {

    // #2 Наследование интерфейсов
    interface Moveable {
        void move();
    }

    interface Flyable extends Moveable {
        void fly();
    }

    class SuperDrone implements Flyable {
        public void move() { System.out.println("Дрон перемещается по земле"); }
        public void fly() { System.out.println("Дрон взлетает в небо"); }
    }

    // #3 Максимально общая коллекция
    interface MyCollection<E> extends Iterable<E> {
        int size();
        boolean add(E element);
        void clear();
    }
}
