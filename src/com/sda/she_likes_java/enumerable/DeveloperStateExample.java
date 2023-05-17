package com.sda.she_likes_java.enumerable;

public class DeveloperStateExample {
    public static void main(String[] args) {
        System.out.println("Hey, let's start the day");

        ProgrammersStates myState = ProgrammersStates.NORMAL;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel: " + myState.getDescription());

        System.out.println("I've got new task. Great!!!");
        myState = ProgrammersStates.GOD_MODE;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel: " + myState.getDescription());


        System.out.println("after a while I'm exhausted - stupid task");
        myState = ProgrammersStates.EXHAUSTED;
        System.out.println("I'm in " + myState + " state");
        System.out.println("I feel: " + myState.getDescription());
        System.out.println("Enums methods");
        System.out.println("name: " + ProgrammersStates.GOD_MODE.name());
        System.out.println("ordinal: " + ProgrammersStates.GOD_MODE.ordinal());
        ProgrammersStates[] allStates = ProgrammersStates.values();
        System.out.println("Should be normal:" + allStates[2]);
    }
}