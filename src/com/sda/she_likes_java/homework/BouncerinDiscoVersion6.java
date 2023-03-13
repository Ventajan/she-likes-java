package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerinDiscoVersion6 {
    public static void main(String[] args) {
//        Exercise 10.
//A story about bouncers in a disco
//Prepare a new class BouncersInDiscoStory and in it
//- get the user’s age, ability to sing well and height from the console
//- there are two bouncers in the disco: young and old
//- Young checks if the person is adult, tall (or short :)) and can sing well
//- Old has some kind of sight problem - so if any of the conditions are met, the person can enter the disco
//- people try to cheat, so if someone is rejected by the young bouncer they try again with the old one:
//        System.out.println("Partytime");
//        System.out.println("Sombody is coming to club");
//        System.out.println("How old and how hight are you");
//
//        Scanner inputReader = new Scanner(System.in);
//        String declineMessage = "Sorry, go home:)";
//        int age = inputReader.nextInt();
//        System.out.println("Let me know Your height now: ");
//        int height = inputReader.nextInt();
//        boolean isAllowedToParty = age >= 20  && height >= 160;
//
//        if (!isAllowedToParty) {
//            System.out.println(declineMessage);
//
//        } else {
//            System.out.println("Have a great time at party!!!");
//        }
//        System.out.println("Here's a story about two bouncers at a disco");
//
//        System.out.println("Someone tries to enter the disco");

        int age;
        int height;
        boolean isAbleToSingWell;
        Scanner inputReader = new Scanner(System.in);

        System.out.println("Now trial with first bouncer");

        System.out.println("How old are You? ");
        age = inputReader.nextInt();

        System.out.println("Can You sing well? ");
        isAbleToSingWell = inputReader.nextBoolean();

        System.out.println("How tall are You? ");
        height = inputReader.nextInt();

        boolean canEnterTheParty = age >= 18 && height > 180 && isAbleToSingWell == true;
//boolean canEnterTheParty = (age >= 18&& age <30) && height > 180 && isAbleToSingWell == true;
        if (canEnterTheParty) {
            System.out.println("Welcome to party!!!");
        } else {
            System.out.println("Sorry, go home");

            System.out.println("I'll try with second bouncer");

            System.out.println("Second bounder is starting to ask questions");
            System.out.println("How old are You? ");
            age = inputReader.nextInt();

            System.out.println("Can You sing well? ");
            isAbleToSingWell = inputReader.nextBoolean();

            System.out.println("How tall are You? ");
            height = inputReader.nextInt();

            canEnterTheParty = age >= 18 || height > 180 || isAbleToSingWell == true;

            if (canEnterTheParty) {
                System.out.println("Ahhh - great. Let's party");
            } else {
                System.out.println(":(:(:(");
            }
        }

    }
}












