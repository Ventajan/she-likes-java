import java.awt.*;
import java.util.Scanner;

//public class Calculator {
//psvm shortcut


//    public static void main(String[] args) {
//        System.out.println("Calculator....");
//        System.out.println("Calculating sum of two numbers");
//        System.out.println("Provide first number");
//        int firstNumber;
//        int secondNumber;
////        TODO: explain object creation
//        Scanner inputReader = new Scanner(System.in);
//        firstNumber = inputReader.nextInt();
//        System.out.println("You provided number: " + firstNumber);
//        System.out.println("Provide second number");
//
//        secondNumber = inputReader.nextInt();
//        System.out.println("You provided number: " + secondNumber);
//        int sum = firstNumber + secondNumber;
//        System.out.println("Sum is: " + sum);
//        Exercice 8
//        Create calculator with 4 suported operations which is able to read from user

//        public static void main(String[] args) {
//        System.out.println("Calculator....");
//        System.out.println("Calculating sum of four numbers");
//        System.out.println("Provide first number");
//        int firstNumber;
//        int secondNumber;
//        int thirdNumber;
//
////        TODO: explain object creation
//        Scanner inputReader = new Scanner(System.in);
//        firstNumber = inputReader.nextInt();
//        System.out.println("You provided number: " + firstNumber);
//        System.out.println("Provide second number");
//        secondNumber = inputReader.nextInt();
//        System.out.println("You provided number: " + secondNumber);
//            System.out.println("Provide third number");
//        thirdNumber = inputReader.nextInt();
//        System.out.println("You provided number: " + thirdNumber);
//
//
//
//        int sum = firstNumber + secondNumber+thirdNumber;
//        System.out.println("Sum is: " + sum);

// \n to separate lines
//                System.out.println(\n);
//                Exercise 9.
//                Bouncer in a disco
//                Prepare a new class BouncerInDisco and in it
//                - get the user’s age and height from the console
//                        - only people who are at least 16 years old and taller (or shorter than - at your choice) can enter the disco
//                - print a text saying how the verification went in both cases
public class Calculator {

    public static void main(String[] args) {
        System.out.println("Condtionals :)");
        int age = 15;
        int higt = 171;
        boolean isPeople = age >= 16;
        System.out.println("is people: " + isPeople);
        boolean condition = true;

        if (condition) {
            System.out.println("This will be run only when condition is true");
        } else {
            System.out.println("This will be run when condition is false");
        }
        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me what age and hight of People");

        int peopleAge1 = inputReader.nextInt();
        int peopleHigh1 = inputReader.nextInt();
        if (peopleAge1 >= 16 || peopleHigh1 >= 171) {
            System.out.println("Welcome");
        } else {
            System.out.println("Go away, please");
        }


    }
}
