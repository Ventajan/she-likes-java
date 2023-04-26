package com.sda.she_likes_java.common_behaviour.wrong_approach;

public class Superman extends Object implements  Flyable,Swimmable
{

    @Override
    public void fly() {
        System.out.println("Superman is flying");
    }

    @Override
    public void swim() {
        System.out.println("Superman is super swimmer");
    }
}
