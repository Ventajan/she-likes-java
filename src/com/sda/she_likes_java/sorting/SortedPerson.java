package com.sda.she_likes_java.sorting;

public class SortedPerson implements Comparable<SortedPerson> {
    private final String name;
    private final int age;

    public SortedPerson(String name, int age) {
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "SortedPerson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(SortedPerson o) {
        // age = 2 vs o.age = 3
//        return o.getAge() - age;
//        return age - o.getage();
        System.out.println("Called by Java");
        if (age < o.getAge()) {
            return -1;
        } else if (age > o.getAge()) {
            return 1;
        } else {
            return 0;
        }
    }
}