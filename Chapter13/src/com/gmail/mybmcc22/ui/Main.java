package com.gmail.mybmcc22.ui;

import com.gmail.mybmcc22.models.Book;
import com.gmail.mybmcc22.models.BookCatalog;
import com.gmail.mybmcc22.models.Customer;
import com.gmail.mybmcc22.utilities.Gender;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;


//CHapter 13
//Formatting Numbers
//Precision Decimals

//Chapter 14
//Garbage Collection
public class Main {

    public static void main(String[] args) {
//Chapter 13
        double d = 1;

        NumberFormat nf = NumberFormat.getCurrencyInstance();
        nf.setMinimumFractionDigits(5);
        nf.setMaximumFractionDigits(5);

        BigDecimal price = new BigDecimal(0.1);
        BigDecimal addValue = new BigDecimal(0.1);
        for (int i = 0; i<10; i++) {
            price = price.add(addValue);
            System.out.println(price);
        }
//--------------
        BookCatalog bookCatalog = new BookCatalog();//instance of bookCatalog

        Book book1 = new Book(1, "Better Java", "Matt Green", "23456");
        Book book2 = new Book(2, "Even Better Java", "Rasul Mohammad", "34568");

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
    }
}
