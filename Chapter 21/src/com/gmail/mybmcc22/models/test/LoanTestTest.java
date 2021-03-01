package com.gmail.mybmcc22.models.test;

import com.gmail.mybmcc22.models.Book;
import com.gmail.mybmcc22.models.Customer;
import com.gmail.mybmcc22.models.Loan;
import com.gmail.mybmcc22.utilities.Gender;
import org.junit.jupiter.api.Test;

import java.util.GregorianCalendar;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class LoanTestTest {

    @Test
    void testDueDate() {

        Book book = new Book(0," "," ", " ", " ",
                0);
        Customer customer = new Customer("","","","",
        "","",0, Gender.MALE);

        Loan loan = new Loan(0, customer, book);

        GregorianCalendar gcExpected = new GregorianCalendar();
        gcExpected.add(GregorianCalendar.DAY_OF_WEEK, 14);

        //gcActual times stamp from the point of creation
        GregorianCalendar gcActual = new GregorianCalendar();
        gcActual.setTime(loan.getDueDate());

        assertEquals(gcExpected.get(GregorianCalendar.YEAR), gcActual.get(GregorianCalendar.YEAR));
        assertEquals(gcExpected.get(GregorianCalendar.MONTH), gcActual.get(GregorianCalendar.MONTH));
        assertEquals(gcExpected.get(GregorianCalendar.DAY_OF_MONTH), gcActual.get(GregorianCalendar.DAY_OF_MONTH));
    }
}