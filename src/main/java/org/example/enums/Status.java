package org.example.enums;

public enum Status {

    AVAILABLE("Dostępny"),
    BORROWED("Wypożyczony"),
    RESERVED("Zarezerwowany");

    private final String polishStatus;

    Status(String polishStatus) {
        this.polishStatus = polishStatus;
    }

    public String getPolishStatus() {
        return polishStatus;
    }
}
