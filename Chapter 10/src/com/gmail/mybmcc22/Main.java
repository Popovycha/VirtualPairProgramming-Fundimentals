package com.gmail.mybmcc22;

public class Main {
	//Chapter 10
    //Collection class
	// null --> Empty Element
	//Aggregation methods
	public static void main(String[] args) {

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
	}
}