package org.example;

import org.example.enums.Status;
import org.example.models.Book;

import java.time.Year;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        setRandomBooks(books);
        System.out.println(books[1].borrowItem()); // true
        System.out.println(books[1].borrowItem()); // false
        System.out.println(books[4].borrowItem()); // true
        System.out.println(books[4].returnItem()); // true
        System.out.println(books[4].returnItem()); // false
        System.out.println(books[4].getStatus().getPolishStatus()); // Dostępny
        System.out.println(books[4].borrowItem()); // true
    }

    private static void setRandomBooks(Book[] books) {
        for (int i = 0; i < 5; i++) {
            Book book = new Book();
            book.setAuthor("J.K. Rowling");
            book.setTitle("Harry Potter " + (i + 1));
            book.setYearPublished(Year.of(2005 + i + 2));
            books[i] = book;
        }

    }
}