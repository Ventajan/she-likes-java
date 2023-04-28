package com.sda.she_likes_java.homework.Exercise21;

public class Main {
    public static void main(String[] args) {

        Vehile Ship = new Ship();
        Ship.movementType();
        ((Floating)Ship).floating();
        Vehile airplane = new Airplane();
       airplane.movementType();
        ((Flying)airplane).flying();

        Vehile submarine = new Submarine();

        submarine.movementType();
        ((Diving)submarine).dive();

    }
}
