package com.sda.she_likes_java.homework.CodingBook;

public class PraseOMatic {
    public static void main(String[] args) {
        String [] wordListOne = {"agnostic", "reactive", "functional", "AI enabled"};
        String [] wordListTwo = {"six sigma", "event driven", "serverless", "microservices"};
        String [] wordListTree = {"framwork", "pipeline", "DSL", "architecture", "design"};
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int treeLength = wordListTree.length;
        java.util.Random randomGenerator = new java.util.Random();
        int randl1 = randomGenerator.nextInt(oneLength);
        int rand2 = randomGenerator.nextInt(twoLength);
        int rand3 = randomGenerator.nextInt(treeLength);
        String phrase = wordListOne [randl1] + "" + wordListTwo [rand2] + "" + wordListTree [rand3];
        System.out.println( "What we need is a " + phrase);
    }

}
