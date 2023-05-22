package com.sda.she_likes_java.exceptions;

public class SecretExample {

    public static void main(String[] args) {
        SecretLocker secretStorage = new SecretLocker(
                null
        );

        System.out.println("I know Your secret now!!!");
        Secret enemySecret = secretStorage.tellMeYourSecret();
        System.out.println("Enemy biggest secret was: " + enemySecret);
    }
}