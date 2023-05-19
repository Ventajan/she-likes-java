package com.sda.she_likes_java.homework.Exercise26;

public class MainEvents {
    public static void main(String[] args) {
        System.out.println("Lets count the events of the year");
        ImportantEvents events = ImportantEvents.CHRISTMAS;
        System.out.println("On winter time I celebrate:" + events + "with family");
        System.out.println("We call it: " + events.getDescription());

        System.out.println("Coming warm days");
        events = ImportantEvents.EASTERN;
        System.out.println("On spring time we celebrates" + events + "with family and eggs");
        System.out.println("we call it" + events.getDescription());

        System.out.println("Getting hot");
        events = ImportantEvents.MIDSUMMER;
        System.out.println("On summers with friends we celebrate" + events + " a lot of fires everywhere");
        System.out.println("we call it" + events.getDescription());

        System.out.println("Getting cold and raining");
        events = ImportantEvents.VESPERS;
        System.out.println("Visiting cemetary" + events + " a lot of sadness");
        System.out.println("we call it" + events.getDescription());

    }
}
