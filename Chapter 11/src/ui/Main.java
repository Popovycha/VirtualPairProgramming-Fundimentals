package ui;

import models.Book;
import models.BookCatalog;
import models.Customer;
import utilities.Gender;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    //Chapter11
    //Packages
    //Importing
    //Unique names
    //-------------
    //Chapter 12
    //java.util
    //dateformat
    //GregorianCalendar
    public static void main(String[] args) {
//Chapter 12
//        Date today = new Date();
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MMM-dd");
//        GregorianCalendar gCal = new GregorianCalendar(2007,0, 1);
//        gCal.add(GregorianCalendar.DAY_OF_MONTH, 67);
//
//        today = gCal.getTime();
//        System.out.println("today is " + sdf.format(today));


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
    }
}
