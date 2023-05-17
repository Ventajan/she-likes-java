package com.sda.she_likes_java.homework.Exercise25;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CitesCountries database = new CitesCountries();
        database.addCountry("USA", List.of("New York", "Los Angeles", "Chicago"));
        database.addCountry("Canada", List.of("Toronto", "Vancouver", "Montreal"));
        database.addCountry("France", List.of("Paris", "Marseille", "Lyon"));
        List<String> citiesInUSA = database.getCitiesInCountry("USA");
        System.out.println("Cities in USA: " + citiesInUSA);
        List<String> countryNames = database.getCountryNames();
        System.out.println("Country names: " + countryNames);
    }
}


