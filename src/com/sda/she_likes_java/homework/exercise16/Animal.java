package com.sda.she_likes_java.homework.exercise16;

public class Animal {
    private String firstname;
    private String age;
    private String bread;
    private String owner;


    public Animal(String firstname, String age, String bread) {
        this.firstname = firstname;
        this.age = age;
        this.bread = bread;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "firstname='" + firstname + '\'' +
                ", age='" + age + '\'' +
                ", bread='" + bread + '\'' +
                '}';
    }
public void decribeAnimal(){
    System.out.println("Hi this is my dog" + firstname);
}
    public static void main(String[] args) {
        Animal animal = new Animal("Gile", "9", "hunting dog");
        System.out.println( "Dog is" + animal);
        animal.decribeAnimal();
    }


}
