package com.sda.she_likes_java.collections.list;

import java.util.List;

public class MyDictionaries {
    //    create english polish dictionary
//    vreate english cech dictionary
    public static MyGreatDictionary createEnglishPolishDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("house", "dom")
        );
        MyGreatDictionary englishPolishDictionary = new MyGreatDictionary();
        englishPolishDictionary.fillWithWordsBilingual(list);
        return englishPolishDictionary;
//        metodas
    }

    public static MyGreatDictionary creatingEnglishCechDictionary() {
        List<WordsBilingual> list = List.of(
                new WordsBilingual("house", "dum")
        );
        MyGreatDictionary englishChecDictionary = new MyGreatDictionary();
        englishChecDictionary.fillWithWordsBilingual(list);
        return englishChecDictionary;
//        metodas

    }
}
