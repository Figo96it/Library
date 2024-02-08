package org.example.models;

import org.example.enums.Status;
import org.example.interfaces.Borrowable;

import java.time.LocalDate;

public class Newspaper extends LibraryItem implements Borrowable {

    private String publishingHouse;
    private LocalDate publicationDate;

    private Newspaper(Status status, String publishingHouse, LocalDate publicationDate) {
        super(status);
        this.publishingHouse = publishingHouse;
        this.publicationDate = publicationDate;
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

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "publishingHouse='" + publishingHouse + '\'' +
                ", publicationDate=" + publicationDate +
                '}';
    }
}
