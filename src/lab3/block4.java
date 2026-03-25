package lab3;

import java.util.Arrays;

class Chocolate implements Comparable<Chocolate> {
    private final String name;
    private final double weight;

    public Chocolate(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Chocolate other) {
        return Double.compare(this.weight, other.weight);
    }

    @Override
    public String toString() {
        return name + " (" + weight + "g)";
    }
}

class Sort {
    // Универсальный метод swap для любого типа
    public static <E> void swap(E[] array, int i, int j) {
        E temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Универсальный Bubble Sort для всего, что можно сравнивать (Comparable)
    public static <E extends Comparable<? super E>> void bubbleSort(E[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swap(array, j, j + 1);
                }
            }
        }
    }
}