package lab3;

import java.util.Iterator;

interface MyCollection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean add(E element);
    boolean remove(Object o);
    void clear();
    boolean contains(Object o);

    @Override
    Iterator<E> iterator();
}

// Простая реализация для примера (опционально)
class MyArrayList<E> implements MyCollection<E> {
    private Object[] elements = new Object[10];
    private int size = 0;

    public int size() { return size; }
    public boolean isEmpty() { return size == 0; }
    public void clear() { size = 0; }

    public boolean add(E element) {
        if (size == elements.length) return false;
        elements[size++] = element;
        return true;
    }

    public boolean remove(Object o) { return false; } // Упрощено
    public boolean contains(Object o) { return false; } // Упрощено

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            private int cursor = 0;
            public boolean hasNext() { return cursor < size; }
            public E next() { return (E) elements[cursor++]; }
        };
    }
}