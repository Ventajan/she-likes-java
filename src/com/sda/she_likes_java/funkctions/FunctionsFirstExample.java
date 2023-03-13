package com.sda.she_likes_java.funkctions;

public class FunctionsFirstExample {
    public static void main(String[] args) { //main is function, but is given by java


    // it's a piece of the code which I can call many times
// function features
// has name just before opening bracets like "main"
// has parameters inside bracets: String [] args
// has return value: type name before name of the functions e.g. void
//        we call funtions by its name
//        functions are like services in real life
        printMyName();// function
        System.out.println();
        System.out.println("After cal....");
        System.out.println();
        printMyName();


}
public static void printMyName(){
        int numberOfTimes =10;
        while (numberOfTimes>0) {
            System.out.println("Hi, I am Vilma");
            numberOfTimes--;

        }
}





}
