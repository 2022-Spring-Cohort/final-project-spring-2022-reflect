package com.project.reflect.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String bookName;
    private String author;
    //aboutBook content will just be copy/paste from Amazon
    private String aboutBook;
    //bookLink will be link to the books Amazon page
    private String bookLink;
    private int year;

//    public Book(String bookName, String author, String aboutBook, String bookLink, int year) {
//        this.bookName = bookName;
//        this.author = author;
//        this.aboutBook = aboutBook;
//        this.bookLink = bookLink;
//        this.year = year;
//    }

    public Book(String bookName, String author) {
        this.bookName = bookName;
        this.author = author;
    }

    public Book() {
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAboutBook() {
        return aboutBook;
    }

    public void setAboutBook(String aboutBook) {
        this.aboutBook = aboutBook;
    }

    public String getBookLink() {
        return bookLink;
    }

    public void setBookLink(String bookLink) {
        this.bookLink = bookLink;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
