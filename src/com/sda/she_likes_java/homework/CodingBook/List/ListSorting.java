package com.sda.she_likes_java.homework.CodingBook.List;

import com.sda.she_likes_java.homework.ExeciseJouronal.LessonJournal;

import java.util.ArrayList;
import java.util.List;

public class ListSorting {
    public static List<String> getSongString() {
        List<String> songs = new ArrayList<>();
        songs.add("Beatles");
        songs.add("soul");
        songs.add("rain");
        songs.add("50 sweet");
        return songs;
    }


    public static List<SongV2> getSongsV2() {
        List<SongV2> songs = new ArrayList<>();
        songs.add(new SongV2("Love", "Beatles", 138));
        songs.add(new SongV2("casidy", "greatfull dead", 128));
        songs.add(new SongV2("Cielo", "The Cars", 118));
        songs.add(new SongV2("Barbara", "Streisand", 198));
        return songs;
    }

    public static List<LessonJournal> getlessonJournal() {

        return null;
    }
}
