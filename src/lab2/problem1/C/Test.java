package lab2.problem1.C;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        Smartphone phone1 = new Smartphone("Apple", "iPhone 15");
        Smartphone phone2 = new Smartphone("Apple", "iPhone 15");

        System.out.println("Равны ли объекты через equals? " + phone1.equals(phone2));

        HashSet<Smartphone> set = new HashSet<>();
        set.add(phone1);
        set.add(phone2);

        // Если equals и hashCode работают верно, размер будет 1, а не 2
        System.out.println("Размер HashSet (дубликаты должны удалиться): " + set.size());
    }
}