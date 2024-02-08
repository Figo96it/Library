package org.example.models;

import org.example.enums.Status;

public abstract class LibraryItem {
    private Status status;

    public LibraryItem() {
        this.status = Status.AVAILABLE;
    }

    public LibraryItem(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "LibraryItem{" +
                "status=" + status +
                '}';
    }
}
