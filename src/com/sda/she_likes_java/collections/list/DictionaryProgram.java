package com.sda.she_likes_java.collections.list;

import java.util.Scanner;

public class DictionaryProgram {
    public static void main(String[] args) {
        MyGreatDictionary createEnglishChechDictionary = MyDictionaries.creatingEnglishCechDictionary();
        createEnglishChechDictionary.translateFromSourceLanguageToDestiny("dog");
        createEnglishChechDictionary.translateFromSourceLanguageToDestiny("house");

        MyGreatDictionary englishPolishDictionary = MyDictionaries.createEnglishPolishDictionary();
        System.out.println("Hi, which dictionary you'd like to use");
        System.out.println("type 1 for English - Cech");
        System.out.println("type 2 for English - Polish");
//        Console console = System.console();
//
        Scanner inputReader = new Scanner(System.in);
        String userChoice = inputReader.next();
        if (userChoice.equals("1")) {
            System.out.println("let's use English - Cech dictionary");
        } else if (userChoice.equals("2")) {
            englishPolishDictionary = MyDictionaries.createEnglishPolishDictionary();
            System.out.println("let's use English - Polish dictionary");
            System.out.println("Provide word to translate: ");
            String wordFromTheUser = inputReader.next();
            englishPolishDictionary.translateFromSourceLanguageToDestiny(wordFromTheUser);
        } else {
            System.out.println("I don't know what you mean");
        }
    }
}









