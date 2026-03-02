package main;

import java.util.ArrayList;

public class Library {
    ArrayList<Book> book = new ArrayList<>();

    public void addBook(Book newBook) {
        book.add(newBook);
    }

    public ArrayList<Book> getBooks() {
        return book;
    }

    public void listBooks() {
        int bookCount = 0;
        for(Book b : book) {
            b.displayInfo();
            System.out.println("Kirjan kategoria: " + b.categorize());
            bookCount = b.copies + bookCount;
            
        }
        System.out.println("Kirjojen määrä kirjastossa on: " + bookCount );

    }








}
