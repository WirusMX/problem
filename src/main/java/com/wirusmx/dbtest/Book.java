package com.wirusmx.dbtest;

import javax.persistence.*;

@Entity
@Table (name = "BOOKS")
public class Book {
    @Id
    @Column (name = "ID")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "BOOK_TITLE")
    private String title;

    @Column(name = "BOOK_AUTHOR")
    private String author;

    @Column (name = "BOOK_PRICE")
    private int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
