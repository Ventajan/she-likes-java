package com.sda.she_likes_java.loops;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random numberGenerator = new Random();
        int someRandomNumber = numberGenerator.nextInt( 10);
//        System.out.println("Random number provided by java is: " + someRandomNumber);
        Scanner inputReader = new Scanner(System.in);
        int useAnswer;
      System.out.println("Play game with me");

        int userAnswer = inputReader.nextInt();
        do {
            System.out.println("Gues a namber between 1 and 10");

            userAnswer = inputReader.nextInt();
        }while (userAnswer!=someRandomNumber);
        System.out.println( "Great, You win");
    }
}
