package lab2.problem1.B;

public abstract class LibraryItem {
    private String title;
    private String author;
    private int publicationYear;

    public LibraryItem(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.publicationYear = year;
    }

    // Геттеры (Getters)
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    // Сеттеры (Setters)
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public String toString() {
        return title + " by " + author + " (" + publicationYear + ")";
    }
}