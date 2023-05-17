package com.sda.she_likes_java.homework.Exercise25;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CitesCountries {
    private Map<String, List<String>> countries;

    public CitesCountries() {
        countries = new HashMap<>();
    }

    public void addCountry(String country, List<String> cities) {
        countries.put(country, cities);
    }

    public List<String> getCitiesInCountry(String country) {
        return countries.get(country);
    }

    public List<String> getCountryNames() {
        return new ArrayList<>(countries.keySet());
    }
}

