package com.sda.she_likes_java.string;

public class StringExample {
    public static void main(String[] args) {
        String name = "Vilma";
        String surname = "Jankune";
        int age = 50;
        System.out.println("Hi, I'm " + name + " " + surname + ". I am " + age + " years old.");
        // Hi, I'm (name) (surname). I am (age) old
        System.out.println("Hi, I'm " + name + " " + surname +". I am " + age + " old.");
        // %s means String wildcard
        // %d means number wildcard
        System.out.println(String.format("Hi, I'm %s %s. I am %d years old.",name, surname, age));
        System.out.println("Hi, I'm %s %s. I am %d years old.".formatted(name, surname, age));
    }
}


