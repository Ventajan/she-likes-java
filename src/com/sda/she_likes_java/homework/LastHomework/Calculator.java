package com.sda.she_likes_java.homework.LastHomework;

public interface Calculator {
    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            throw new ArithmeticException("Canot divide by zero");
        }
    }

    int mult(int a, int b);
}
