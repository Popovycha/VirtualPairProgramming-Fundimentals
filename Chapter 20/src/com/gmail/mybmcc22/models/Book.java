package com.gmail.mybmcc22.models;

public class Book extends Material {
    private int bookID;
    private String title;
    private String author;
    private String isbn;
    private String branch;//ch15
    private int noOfPages;//ch15

    public Book(int id, String title, String author, String isbn, String branch, int noOfPages) {
        super(id, title, branch); //parent class
        this.author = author;
        this.isbn = isbn;
        this.noOfPages = noOfPages;
    }

//    public String getTitle() {
//        return title;
//    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public int getBookID() {
        return bookID;
    }
    public void sendForRepair() {
        System.out.println("Book has been sent for repair ");
    }
    public int getLoanPeriod() {
        return 21;
    }
}
