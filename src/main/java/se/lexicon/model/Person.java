package se.lexicon.model;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Person {
    private static int sequencer = 0;
    private int id;
    private String firstName;
    private String lastName;
    private String[] bookBorrowed = new String[0];

    public Person(String firstName, String lastName) {
        this.id = getNextId();
        setFirstName(firstName);
        setLastName(lastName);
    }

    public void setFirstName(String firstName) {
        if (firstName == null || firstName.trim().isEmpty()) {
            throw new IllegalArgumentException("First name cannot be null or empty.");
        }
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.trim().isEmpty()) {
            throw new IllegalArgumentException("Last name cannot be null or empty.");
        }
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getId() {
        return this.id;
    }

    private static int getNextId() {
        return ++sequencer;
    }

    public void loanBook(Book book) {
        if (book.isAvailable()){
            bookBorrowed = Arrays.copyOf(bookBorrowed, bookBorrowed.length+1);
            bookBorrowed[bookBorrowed.length-1] = book.getTitle();
            book.setBorrower(this);
        }
    }


    public void returnBook(Book book) {
        if (!book.isAvailable())
        for (String book.getTitle() : this.bookBorrowed)
    }
    //check if book is available
    //if not available then

    public String getPersonInformation() {
        return "Person: " + getFirstName() + " " + getLastName() + ", Id:" + getId();
    }
}