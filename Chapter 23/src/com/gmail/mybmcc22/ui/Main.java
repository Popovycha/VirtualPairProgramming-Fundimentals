package com.gmail.mybmcc22.ui;

import com.gmail.mybmcc22.models.*;
import com.gmail.mybmcc22.utilities.Gender;

public class Main {

    public static void main(String[] args) {
	// write your code here
        MaterialCatalog materialCatalog = new MaterialCatalog();//instance of bookCatalog

        Book book1 = new Book("1001", "Better Java", "Matt Green", "23456", "Anytown Branch", 400);
        Book book2 = new Book("234X", "Even Better Java", "Rasul Mohammad", "34568", "Any Book", 120);
        Book book3 = new Book("9120", "Learn Japan","Anton Le Noir","3434343","Any Branch", 356);
        Book book4 = new Book("444X", "Learn More Japan","Anton Le Noir","3434343","Any Branch", 356);
        Book book5 = new Book("3345", "Enough Japan","Anton Le Noir","3434343","Any Branch", 356);
        DVD dvd1 = new DVD("3","An Epic Film", "Anytown", "Spielberg", "9987", 120);
        DVD dvd2 = new DVD("4","An Epic Film", "Anytown", "Spielberg", "9987", 120);

        //System.out.println(dvd1.getTitle());
        //book1.relocate("MyCity branch");




        materialCatalog.addMaterial(book1);
        materialCatalog.addMaterial(book2);
        materialCatalog.addMaterial(book3);
        materialCatalog.addMaterial(book4);
        materialCatalog.addMaterial(book5);
        materialCatalog.addMaterial(dvd1);
        materialCatalog.addMaterial(dvd2);

        UI ui = new UI();
        ui.printHeader();

        ui.printMaterialCatalog(materialCatalog.getMap());//calling for a method
        //Ch18
//        try {
//            Book foundBook = bookCatalog.findBook("better");
//            System.out.println("We found " + foundBook.getTitle());
//        }
//        catch (BookNotFoundException e)
//        {
//            System.out.println("The book wasn't found");
//        }
//
//
//        int myTest = 1;
//
//        try {
//
//            if (myTest != 2) {
//                throw new RuntimeException("Something went wrong");
//            }
//        }
//        catch (RuntimeException e)
//        {
//            //do nothing here so that we can continue
//        }
//        ///
//
//
//        //CH12, Expiration for the new customer in a year from today
        Customer customer = new Customer("Mr", "Michael", "Smith",
                "234 Croft Str", "3475683399","mismith@gmail.com",
                1, Gender.MALE);
        System.out.println(customer.getExpiryDate());
        System.out.println(customer.getMailingName());
        //CH17
        System.out.println(customer);
        //System.out.println(dvd1);

        //System.out.println(dvd1.equals(dvd2));//need to override


        Loan firstLoan = new Loan(1,customer,book1);
        System.out.println(firstLoan.getDueDate());
        System.out.println(firstLoan);

        LoanRegistry registry = new LoanRegistry();
        try {
            registry.addLoan(firstLoan);
            System.out.println("addLoan worked");
        }
        catch (LoanAlreadyExistsException e) {
            System.out.println("addLoan failed");
        }

        try {
            registry.addLoan(firstLoan);
            System.out.println("addLoan worked");
        }
        catch (LoanAlreadyExistsException e) {
            System.out.println("addLoan failed");
        }


        System.out.println(registry.isBookOnLoan(book1.getId()));
        firstLoan.endLoan();
        System.out.println(registry.isBookOnLoan(book1.getId()));


    }
}
