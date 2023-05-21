package com.sda.she_likes_java.homework.Exercise27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyDateImplement {
    public static void main(String[] args) {
        List<MyDate> dates = new ArrayList<>();
        dates.add(new MyDate(2023, 5, 15));
        dates.add(new MyDate(2022, 12, 31));
        dates.add(new MyDate(2023, 1, 1));
        dates.add(new MyDate(2022, 6, 30));
        Collections.sort(dates);
        for (
                MyDate date : dates) {
            System.out.println(date.getYear() + "-" + date.getMonth() + "-" + date.getDay());
        }
    }
}


