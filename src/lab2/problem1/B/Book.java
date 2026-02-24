package lab2.problem1.B;

public class Book extends LibraryItem {
    private int numberOfPages;

    public Book(String title, String author, int year, int pages) {
        super(title, author, year); // Вызов конструктора родителя
        this.numberOfPages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + numberOfPages + " pages";
    }
}