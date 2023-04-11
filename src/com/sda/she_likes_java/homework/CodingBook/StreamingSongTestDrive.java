package com.sda.she_likes_java.homework.CodingBook;

public class StreamingSongTestDrive {
    public static void main(String[] args) {
        StreamingSong  song = new StreamingSong();
        StreamingSong.artist = "The beatles";
        StreamingSong.title = "Come Together";
        StreamingSong.play ();
        StreamingSong.printDetails();

    }
}
