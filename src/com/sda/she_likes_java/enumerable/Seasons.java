package com.sda.she_likes_java.enumerable;

public enum Seasons {

    WINTER(-5, "skiing"),
    SUMMER(25, "running"),
    SPRING(10, "sleeping"),
    AUTUMN(5, "walking");

    private int averageTemp;
    private String activity;

    private Seasons(int averageTemp, String activity) {
        this.averageTemp = averageTemp;
        this.activity = activity;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public int getAverageTemp() {
        return averageTemp;
    }
}

