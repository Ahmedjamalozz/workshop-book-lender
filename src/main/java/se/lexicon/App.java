package se.lexicon;


import se.lexicon.model.Book;
import se.lexicon.model.Person;

public class App {
    public static void main(String[] args) {
        Person erik = new Person("Erik", "Lengyel");
        System.out.println(erik.getPersonInformation());

        Book javaFullStack = new Book("Java Full Stack", "Mehrdad Javan", erik);
        System.out.println(javaFullStack.getBookInformation());
    }

}
