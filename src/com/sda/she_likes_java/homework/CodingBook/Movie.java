package com.sda.she_likes_java.homework.CodingBook;

public class Movie {
    String title;
    String genre;
    int rating;
    void playIt ()
    {
        System.out.println("Playing the movie");
    }
    void printDetails () {
        System.out.println( "This is"+title + genre);
    }
}
