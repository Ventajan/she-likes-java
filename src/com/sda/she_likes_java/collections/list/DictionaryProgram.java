package com.sda.she_likes_java.collections.list;

public class DictionaryProgram {
    public static void main(String[] args) {
        MyGreatDictionary createEnglishChechDictionary = MyDictionaries.creatingEnglishCechDictionary();
        createEnglishChechDictionary.translateFromSourceLanguageToDestiny("dog");
        createEnglishChechDictionary.translateFromSourceLanguageToDestiny("house");
    }
}
