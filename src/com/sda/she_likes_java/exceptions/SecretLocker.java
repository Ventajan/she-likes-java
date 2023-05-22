package com.sda.she_likes_java.exceptions;

public class SecretLocker {

    private Secret mySecret;

    public SecretLocker(Secret mySecret) {
        this.mySecret = mySecret;

    }

    public Secret tellMeYourSecret() {
        System.out.println("I am sharing with you this...");
        return mySecret;
    }

    @Override
    public String toString() {
        return "SecretLocker{" +
                "mySecret=" + mySecret +
                '}';
    }
}