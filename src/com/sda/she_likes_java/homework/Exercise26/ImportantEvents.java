package com.sda.she_likes_java.homework.Exercise26;

public enum ImportantEvents {
    EASTERN("Celebration of resurrection"),
    MIDSUMMER("Saint John celebration"),
    VESPERS("Commemoration of the dead"),
    CHRISTMAS("Celebration of crucifixion");
    String description;
    int date;

    ImportantEvents(String description) {
        this.description = description;
    }

    ImportantEvents(int date) {
        this.date = date;
    }

    public String getDescription() {


        return description;
    }
}