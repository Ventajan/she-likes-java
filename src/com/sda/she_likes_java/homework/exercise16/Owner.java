package com.sda.she_likes_java.homework.exercise16;

//Create a hierarchy of classes:
//        use a separate package: exercise_16
//        new Owner class with private fields
//        First name
//        Surname,
//        Animal
//class Animal containing the fields
//        first name
//        age
//        breed
//        Use private variables and create get/set methods
//        Create a toString() method for each class.
//        Create a main method and a sample class hierarchy. (edited)
public class Owner {


    private String firstname;
    private String surname;
    private String animal;

    public Owner(String firstname, String surname, String animal) {
        this.firstname = firstname;
        this.surname = surname;
        this.animal = animal;
    }

    public Owner() {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", animal='" + animal + '\'' +
                '}';
    }

    public void describeYourself () {
        System.out.println("Hi I am " + firstname);
    }

    public static void main(String[] args) {
        Owner owner = new Owner("Vilma", "Jankun","Dog");
        System.out.println("Owner is "  + owner);

owner.describeYourself();
    }
}
