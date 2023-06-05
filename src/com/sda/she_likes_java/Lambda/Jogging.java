package com.sda.she_likes_java.Lambda;

//Classes fromJavaLangmis imported
//API Application programing interface contract what to do
@FunctionalInterface
//to protect programmer from accident reffactoring
public interface Jogging {
    public abstract void run();

    default void walk() {
    }

    default void drink(String drink) {
    }

}
