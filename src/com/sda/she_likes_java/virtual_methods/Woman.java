package com.sda.she_likes_java.virtual_methods;

public class Woman extends Human{
    @Override
    public void whoYouAre() {
        super.whoYouAre();
        System.out.println("I am woman");
    }
    public void learnJava() {
        System.out.println("I like learn Java");
    }
}
