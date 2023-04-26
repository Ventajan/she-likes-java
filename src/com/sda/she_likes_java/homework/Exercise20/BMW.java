package com.sda.she_likes_java.homework.Exercise20;

public class BMW extends Car{
    @Override
    public void carCanDrive() {
        super.carCanDrive();
        System.out.println("Brrr");
    }
    public void speedUp(){
        System.out.println("Speed");
    }
}
