package com.sda.she_likes_java.enumerable;

import java.util.List;

public class SeasonsExample {
    public static void main(String[] args) {
        Seasons myFavouriteOne = Seasons.SUMMER;
        System.out.println("Average temperature during summer is:" + myFavouriteOne.getAverageTemp());
        System.out.println("Summers activity:" + myFavouriteOne.getActivity());
        myFavouriteOne.setActivity("running");
        System.out.println("Summers activity: " + myFavouriteOne.getActivity());
        Seasons autumn = Seasons.AUTUMN;
        System.out.println("Summer:" + myFavouriteOne);
        List<Seasons> seasonsList = List.of(
                Seasons.AUTUMN,
                Seasons.WINTER
        );
    }
}
