package com.gmail.mybmcc22.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BookTest {

    @Test
    public void test2EqualsBooks() {
        Book book1 = new Book("100", "","","","",1);
        Book book2 = new Book("100", "","","","",1);

        assertTrue(book1.equals(book2));

    }
    @Test
    public void test2NonEqualBooks() {
        Book book1 = new Book("100", "","","","",1);
        Book book2 = new Book("101", "","","","",1);

        assertFalse(book1.equals(book2));
    }
}