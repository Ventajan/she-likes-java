package com.sda.she_likes_java.homework.CodingBook;

public class GoodDogTestDrive {
    public static void main(String[] args) {
        GoddDog one = new GoddDog();
        one.setSize(70);
        GoddDog two = new GoddDog();
        two.setSize(8);
        System.out.println("Dog one: " + one.getSize());
        System.out.println("Dog two:" + two.getSize());
        one.bark();
        two.bark();
    }
}
