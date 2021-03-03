package com.gmail.mybmcc22.models;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class BookCatalog {
    //Integer wrapped class
    private TreeMap<String, Book> bookMap;

    public BookCatalog() {
        bookMap = new TreeMap<String, Book>();
    }

    public TreeMap<String, Book> getBookMap() {
        return bookMap;
    }

    public int getNumberOfBooks() {
        return bookMap.size();
    }
    public void addBook(Book newBook) {
        bookMap.put(newBook.getId(), newBook);
    }

    public Book findBook(String title) throws BookNotFoundException {
        title = title.trim();

        for (Book nextBook : bookMap.values()) {
            if (nextBook.getTitle().equalsIgnoreCase(title)){
                return nextBook;
            }
        }
        throw new BookNotFoundException();
    }

}
