package com.sda.she_likes_java.funkctions;

public class CalculatorWithFuntions {
    public static void main(String[] args) {
        System.out.println("Lets start calculations");

        sum(10,20);
        sum(1,2);
    }
    public static int sum (int first, int second) {
        System.out.println("I am no so smart calculator");
        int result = first +second;
        System.out.println("Result of calculation is "+result);
        return result;
    }
}
