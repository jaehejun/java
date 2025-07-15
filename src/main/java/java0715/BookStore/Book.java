package java0715.BookStore;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Book {
    private String isbn;
    private String title;
    private int price;
    private String author;
    private String description;
    private String genre;
    private LocalDate published;

    public Book(String isbn, String title, int price, String author, String description, String genre, LocalDate published) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
        this.author = author;
        this.description = description;
        this.genre = genre;
        this.published = published;
    }
    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        return isbn+" | "+title+" | "+author+" | "+description+" | "+genre+" | "+published.format(fmt);
    }
}
