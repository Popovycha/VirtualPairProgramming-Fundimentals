package com.gmail.mybmcc22.models.test;

//import com.gmail.mybmcc22.models.BookCatalog;


import com.gmail.mybmcc22.models.Book;
import com.gmail.mybmcc22.models.Material;
import com.gmail.mybmcc22.models.MaterialCatalog;
import com.gmail.mybmcc22.models.MaterialNotFoundException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class MaterialCatalogTest {

    private MaterialCatalog bc;
    private Book book1;
    public MaterialCatalogTest() {
        bc = new MaterialCatalog();
        book1 = new Book("1", "Learning Java", "", "", "", 0);
        bc.addMaterial(book1);
        //constructor runs for each class, rather when constructor in the normal class runs once
        //System.out.println("Constructor being run");

    }

    @Test
    public void testAddBook() {

        int initialNumber = bc.getNumberOfMaterial();

        System.out.println(initialNumber);
        Book book = new Book("2", "", "", "", "", 0);
        bc.addMaterial(book);

        //checks if it increased by one
        assertTrue(initialNumber == bc.getNumberOfMaterial() -1);
    }

    @Test
    public void testFindBook() {
        try {

            Material foundBook = bc.findMaterial("Learning Java");
        }
        catch (MaterialNotFoundException e ){
            fail("Book not found");
        }

    }
    @Test
    public void testFindBookDoesntExist() {
        try {

            Material foundBook = bc.findMaterial("Learning More Java");
            fail("Book not found");
        }
        catch (MaterialNotFoundException e ){
         //Exception was expected, therefore test passed.
        }

    }
    @Test
    public void testFindABookIgnoringCase() {
        try {

            Material foundBook = bc.findMaterial("learning Java");
        }
        catch (MaterialNotFoundException e ){
            fail("Book not found");
        }

    }
    @Test
    public void testFindABookExtraSpace() {
        try {

            Material foundBook = bc.findMaterial(" learning Java ");
        }
        catch (MaterialNotFoundException e ){
            fail("Book not found");
        }

    }

    private void fail(String book_not_found) {
        System.out.println(" ");
    }
}