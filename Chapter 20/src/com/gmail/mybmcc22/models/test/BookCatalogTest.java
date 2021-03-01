package com.gmail.mybmcc22.models.test;

import com.gmail.mybmcc22.models.Book;
import com.gmail.mybmcc22.models.BookCatalog;
import com.gmail.mybmcc22.models.BookNotFoundException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookCatalogTest {

    private BookCatalog bc;
    private Book book1;
    public BookCatalogTest() {
        bc = new BookCatalog();
        book1 = new Book(1, "Learning Java", "", "", "", 0);
        bc.addBook(book1);
        //constructor runs for each class, rather when constructor in the normal class runs once
        //System.out.println("Constructor being run");

    }

    @Test
    public void testAddBook() {

        int initialNumber = bc.getNumberOfBooks();

        Book book = new Book(1, "", "", "", "", 0);
        bc.addBook(book);

        assertTrue(initialNumber == bc.getNumberOfBooks() -1);
    }

    @Test
    public void testFindBook() {
        try {

            Book foundBook = bc.findBook("Learning Java");
        }
        catch (BookNotFoundException e ){
            fail("Book not found");
        }

    }
    @Test
    public void testFindBookDoesntExist() {
        try {

            Book foundBook = bc.findBook("Learning More Java");
            fail("Book not found");
        }
        catch (BookNotFoundException e ){
         //Exception was expected, therefore test passed.
        }

    }
    @Test
    public void testFindABookIgnoringCase() {
        try {

            Book foundBook = bc.findBook("learning Java");
        }
        catch (BookNotFoundException e ){
            fail("Book not found");
        }

    }
    @Test
    public void testFindABookExtraSpace() {
        try {

            Book foundBook = bc.findBook(" learning Java ");
        }
        catch (BookNotFoundException e ){
            fail("Book not found");
        }

    }
}