package com.sda.she_likes_java.virtual_methods;

public class Man extends Human{
    @Override
    public void whoYouAre() {
        super.whoYouAre();
        System.out.println("I am man");

    }
    public void learnToCleanHouse() {
        System.out.println("I like it");
    }
}
