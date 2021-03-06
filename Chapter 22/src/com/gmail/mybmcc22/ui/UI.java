package com.gmail.mybmcc22.ui;


import com.gmail.mybmcc22.models.Book;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class UI {
    public void printHeader() {
        System.out.println("BookID  Title                 Author");
    }

    //We was writing book class and manipulating strings and overloading chapter 9
    public void printBook(Book book) {
        //
        //String bookIDString = String.valueOf(book.getBookID());

        System.out.println(fixLengthString(book.getId(), 6) + "  "
                + fixLengthString(book.getTitle(), 20) + "  "
                + fixLengthString(book.getAuthor(), 20));
    }

    private String fixLengthString(String start, int length) {
        //TODO: fix string padding problem
        if (start.length() >= length) {
            return start.substring(0, length);
        } else {
            while (start.length() < length) {
                start += " ";
            }
            return start;
        }
    }

    private String fixLengthString(int start, int length) {
        //Method Overloading
        String startString = String.valueOf(start);
        return fixLengthString(startString, length);
    }
    //Going thru array
    public void printBookCatalog(TreeMap<String, Book> bookCatalog) {
        for (Book nextBook : bookCatalog.values()) {
            printBook(nextBook);

        }
    }
}
