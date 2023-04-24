package com.sda.she_likes_java.homework.CodingBook;

public class GoddDog {
    private int size;

    public int getSize() {
        return size;
    }

    public void setSize(int s) {
        size = s;

    }

    void bark() {
        if (size > 66) {
            System.out.println("Wooof! Woof");
        } else if (size > 14) {
            System.out.println("Ruff! Ruff");
        } else {
            System.out.println("Yip!Yip");
        }
    }
}
