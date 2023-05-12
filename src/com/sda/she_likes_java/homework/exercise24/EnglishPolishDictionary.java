package com.sda.she_likes_java.homework.exercise24;

import java.util.HashMap;
import java.util.Map;

public class EnglishPolishDictionary {


    private final Map<String, String> dictionary;

    public EnglishPolishDictionary() {
        dictionary = new HashMap<>();
        dictionary.put("house", "dom");
        dictionary.put("sun", "słońce");
        dictionary.put("moon", "księżyc");
        dictionary.put("sky", "niebo");
        dictionary.put("tree", "drzewo");
        dictionary.put("school", "szkoła");
        dictionary.put("pupil", "uczeń");
        dictionary.put("teacher", "nauczyciel");
        dictionary.put("blackboard", "tablica");
    }

    public void translate(String englishWord) {
//        metodas
        String polishTranslation = dictionary.get(englishWord);
        if (polishTranslation != null) {
            System.out.printf("English word: [%s] means [%s] in Polish%n", englishWord, polishTranslation);
//     %n in String gives a new line in console
        } else {
            System.out.printf("Don't know how to translate [%s] into Polish%n", englishWord);
        }
    }
}
