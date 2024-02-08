package org.example.models;

import org.example.enums.Status;
import org.example.interfaces.Borrowable;

import java.time.Year;

public class Book extends LibraryItem implements Borrowable {

    private String title;
    private String author;
    private Year yearPublished;

    public Book() {
    }

    public Book(Status status, String title, String author, Year yearPublished) {
        super(status);
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        isBookMoreThanFiveYears();
    }

    @Override
    public boolean borrowItem() {
        if (this.getStatus().equals(Status.BORROWED) || this.getStatus().equals(Status.RESERVED)) {
            return Boolean.FALSE;
        } else {
            this.setStatus(Status.BORROWED);
            return Boolean.TRUE;
        }
    }

    @Override
    public boolean returnItem() {
        if (this.getStatus().equals(Status.BORROWED) || this.getStatus().equals(Status.RESERVED)) {
            this.setStatus(Status.AVAILABLE);
            return Boolean.TRUE;
        } else {
            return Boolean.FALSE;
        }
    }

    private void isBookMoreThanFiveYears() {
        if (Year.now().compareTo(yearPublished.plusYears(5)) > 0) {
            this.author = this.author.toUpperCase();
        }
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

    public Year getYearPublished() {
        return yearPublished;
    }

    public void setYearPublished(Year yearPublished) {
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearPublished=" + yearPublished +
                ", status=" + super.getStatus().getPolishStatus() +
                '}';
    }
}
