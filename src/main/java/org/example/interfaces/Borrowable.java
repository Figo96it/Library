package org.example.interfaces;

import org.example.models.Book;

public interface Borrowable {
    boolean borrowItem();

    boolean returnItem();
}
