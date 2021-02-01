package com.gmail.mybmcc22;


public class Main {

    public static void main(String[] args) {
        Book book1 = new Book(1, "Better Java", "Matt Green", "23456");
        Book book2 = new Book(2, "Even Better Java", "Rasul Mohammad", "34568");

        UI ui = new UI();
        ui.printHeader();
        ui.printBook(book1);
        ui.printBook(book2);

    /*Customer simon = new Customer("MRs", "Simon", "Pieman", "2457 WEST", "rony@gmail", Gender.MALE );

    System.out.println(simon.getFirstName());
    System.out.println(simon.getLastName());
    System.out.println(simon.getMailingName());

    if (simon.getGender() == Gender.MALE) {
        System.out.println("He is male");
    }*/
    }
}
