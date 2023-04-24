package com.sda.she_likes_java.virtual_methods;

public class HumanLife {
    public void tellMeWhoYouAre(Human human) {
        if (human != null) {
            human.whoYouAre();
        }
    }

    public void tryToCastHumanToMan(Human maybeManOrWoman) {
        //casting/down casting
        //works for the references
        //instannceof operator tests if argument is of given type
        //tests if maybeWomanOrMan is of type Man
        //instanceof gives us boolean result
        if (maybeManOrWoman instanceof Man) {
            (
                    (Man) maybeManOrWoman
            ).learnToCleanHouse();
            (
                    (Man) maybeManOrWoman
            ).learnToCleanHouse();

        }
        if (maybeManOrWoman instanceof Woman) {
            System.out.println( "It is a woman");
            ((Woman) maybeManOrWoman).learnJava();
        }
    }
}