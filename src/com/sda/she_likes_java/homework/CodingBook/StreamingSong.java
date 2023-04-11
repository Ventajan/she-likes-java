package com.sda.she_likes_java.homework.CodingBook;

public class StreamingSong {
    static String title;
    static String artist;
    int duration;

    static void play() {
        System.out.println("Playing song");
    }

    static void printDetails(){
        System.out.println( "This is"+title +"by" +artist);

    }
}


