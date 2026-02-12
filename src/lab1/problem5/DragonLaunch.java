package lab1.problem5;

import java.util.Vector;

public class DragonLaunch {
    // Условие: хранить только в Vector
    private Vector<Person> victims;

    public DragonLaunch() {
        this.victims = new Vector<>();
    }

    public void kidnap(Person p) {
        this.victims.add(p);
    }

    public boolean willDragonEatOrNot() {
        int boysWaitingCount = 0;

        for (Person p : victims) {
            if (p.getGender() == Gender.BOY) {
                // Каждый мальчик — это потенциальная пара для будущей девочки
                boysWaitingCount++;
            } else {
                // Если пришла девочка, она "забирает" одного из стоявших ранее мальчиков
                if (boysWaitingCount > 0) {
                    boysWaitingCount--;
                } else {
                    // Если девочка пришла, а мальчиков перед ней нет,
                    // эта девочка никогда не исчезнет. Дракон точно поест.
                    return true;
                }
            }
        }

        // Если остались непарные мальчики (счетчик > 0), дракон пообедает.
        // Если все нашли пару (счетчик == 0), дракон останется голодным.
        return boysWaitingCount > 0;
    }

    public static void main(String[] args) {
        DragonLaunch launch = new DragonLaunch();

        // Тест из задания: BBGG -> No launch
        launch.kidnap(new Person(Gender.BOY, "A"));
        launch.kidnap(new Person(Gender.BOY, "B"));
        launch.kidnap(new Person(Gender.GIRL, "C"));
        launch.kidnap(new Person(Gender.GIRL, "D"));

        System.out.println("Line: BBGG");
        System.out.println(launch.willDragonEatOrNot() ? "Dragon eats!" : "No launch.");

        // Тест из задания: GBGB -> leaves 2 persons
        DragonLaunch launch2 = new DragonLaunch();
        launch2.kidnap(new Person(Gender.GIRL, "E"));
        launch2.kidnap(new Person(Gender.BOY, "F"));
        launch2.kidnap(new Person(Gender.GIRL, "G"));
        launch2.kidnap(new Person(Gender.BOY, "H"));

        System.out.println("\nLine: GBGB");
        System.out.println(launch2.willDragonEatOrNot() ? "Dragon eats!" : "No launch.");
    }
}