package ie.atu.labweek3;

public class Book {

    private String title;
    private String author;

    private String isbn;
    private int pYear;

    public Book(String title, String author, String isbn, int pYear) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.pYear = pYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getpYear() {
        return pYear;
    }

    public void setpYear(int pYear) {
        this.pYear = pYear;
    }

}
