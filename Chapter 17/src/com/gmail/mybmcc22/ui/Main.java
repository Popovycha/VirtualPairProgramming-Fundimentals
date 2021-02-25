package com.gmail.mybmcc22.ui;

import com.gmail.mybmcc22.models.Book;
import com.gmail.mybmcc22.models.BookCatalog;
import com.gmail.mybmcc22.models.Customer;
import com.gmail.mybmcc22.models.DVD;
import com.gmail.mybmcc22.utilities.Gender;

public class Main {

    public static void main(String[] args) {

            BookCatalog bookCatalog = new BookCatalog();//instance of bookCatalog

            Book book1 = new Book(1, "Better Java", "Matt Green", "23456", "Anytown Branch", 400);
            Book book2 = new Book(2, "Even Better Java", "Rasul Mohammad", "34568", "Any Book", 120);


            DVD dvd1 = new DVD(3,"An Epic Film", "Anytown", "Spielberg", "9987", 120);
            DVD dvd2 = new DVD(3,"An Epic Film", "Anytown", "Spielberg", "9987", 120);
            System.out.println(dvd1.getTitle());
            book1.relocate("MyCity branch");




            bookCatalog.addBook(book1);
            bookCatalog.addBook(book2);

            UI ui = new UI();
            ui.printHeader();

            ui.printBookCatalog(bookCatalog.getBookArray());//calling for a method

            Book foundBook = bookCatalog.findBook("even better java");
            if (foundBook != null) {
                System.out.println("We found " + foundBook.getTitle());
            }
            //CH12, Expiration for the new customer in a year from today
            Customer customer = new Customer("Mr", "Michael", "Smith",
                    "234 Croft Str", "3475683399","mismith@gmail.com",
                    1, Gender.MALE);
            System.out.println(customer.getExpiryDate());
            System.out.println(customer.getMailingName());
            //CH17
            System.out.println(customer);
            System.out.println(dvd1);

            System.out.println(dvd1.equals(dvd2));//need to override


    }
}

