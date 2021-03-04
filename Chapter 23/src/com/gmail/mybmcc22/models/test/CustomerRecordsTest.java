package com.gmail.mybmcc22.models.test;

import com.gmail.mybmcc22.models.Customer;
import com.gmail.mybmcc22.models.CustomerNotFoundException;
import com.gmail.mybmcc22.models.CustomerRecords;
import com.gmail.mybmcc22.utilities.Gender;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomerRecordsTest {

    CustomerRecords records;
    @Test
    public void testAddCustomer() {
        Customer newCustomer = new Customer("Mr", "Matt", "Greencroft", "1 High Street","12345", "matt.com",1, Gender.MALE );

        int initialSize = records.getNumberOfCustomer();

        records.add(newCustomer);

        assertEquals(initialSize, records.getNumberOfCustomer() - 1);

    }

    @Test
    public void testFindCustomer()  {
        try {

            Customer foundCustomer = records.findByName("Mrs S Kind");
        } catch (CustomerNotFoundException e ) {
            fail("Customer not found");
        }
    }
    @Test
    public void testNoDuplicates() {
        Customer newCustomer = new Customer("Mrs", "Sandra", "Kind", "11 Low Street","5467893", "sandra@gmail.com",3, Gender.FEMALE );
        records.add(newCustomer);
        records.add(newCustomer);
        records.add(newCustomer);
        System.out.println(records.allCustomers());

       //assertEquals(1,records.getNumberOfCustomer());
    }

    //instatiation in constructor
    public CustomerRecordsTest() {
        records = new CustomerRecords();

        Customer newCustomer = new Customer("Mrs", "Sandra", "Kind", "11 Low Street","5467893", "sandra@gmail.com",3, Gender.FEMALE );
        records.add(newCustomer);
    }


}