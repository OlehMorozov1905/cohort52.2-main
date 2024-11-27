package homework_17.book.model;

// Создайте класс Book с полями:
// - уникальный номер ISBN
// - название title
// - автор author
// - год издания yearOfPublishing
// - жанр genre
//
// В классе Book реализуйте конструктор, геттеры и сеттеры на все поля и метод display, который выводит информацию о книге.
//        Создайте конструктор, в котором нет поля ISBN.
//        Создайте конструктор, в котором есть только поля title, author и genre.

public class Book {

    private int isbn;
    private String title;
    private String author;
    private int yearOfPublishing;
    private String genre;

    public Book(int isbn, String title, String author, int yearOfPublishing, String genre) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String title, String author, int yearOfPublishing, String genre) {
        this.title = title;
        this.author = author;
        this.yearOfPublishing = yearOfPublishing;
        this.genre = genre;
    }

    public Book(String title, String author, String genre) {
        this.title = title;
        this.author = author;
        this.genre = genre;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
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

    public int getYearOfPublishing() {
        return yearOfPublishing;
    }

    public void setYearOfPublishing(int yearOfPublishing) {
        this.yearOfPublishing = yearOfPublishing;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfPublishing=" + yearOfPublishing +
                ", genre='" + genre + '\'' +
                '}';
    }
}
