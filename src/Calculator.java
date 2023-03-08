import java.util.Scanner;

public class Calculator {
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

        public static void main(String[] args) {
        System.out.println("Calculator....");
        System.out.println("Calculating sum of four numbers");
        System.out.println("Provide first number");
        int firstNumber;
        int secondNumber;
        int thirdNumber;

//        TODO: explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
            System.out.println("Provide third number");
        thirdNumber = inputReader.nextInt();
        System.out.println("You provided number: " + thirdNumber);



        int sum = firstNumber + secondNumber+thirdNumber;
        System.out.println("Sum is: " + sum);

// \n to separate lines
//                System.out.println(\n);




    }
}
