package com.sda.she_likes_java.static_modifier;

public class BookLending {
    private String author;
    private String title;
    private int yearOfPublication;
    public int numberOfBooks;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public BookLending(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        numberOfBooks++;


    }

}