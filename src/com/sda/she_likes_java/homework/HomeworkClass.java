package com.sda.she_likes_java.homework;

import com.sda.she_likes_java.classes.Person;

public class HomeworkClass {
//    Exercise 15.
//    Create a Parent class containing the following variables:
//            - first name
//- surname
//- address - (use the class Address)
//            - firstChild (use class Person)
//- secondChild (use class Person)

    public class Parent {
        String firstname;
        String surname;
        Person firstChild;
        Person secondChild;
        Address address;


    }

    public static void main(String[] args) {
        Address someAddress = new Address();
        someAddress.country = "Poland:) ";
    }




    }


