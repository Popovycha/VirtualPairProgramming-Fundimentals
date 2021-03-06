package com.gmail.mybmcc22.models;


import com.gmail.mybmcc22.utilities.Gender;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Customer {
    private String title;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;
    private String email;
    private int customerNumber;
    private Gender gender;
    private boolean isvalid;
    private Date expiryDate; //CH12

    public Customer (String title, String firstName, String lastName, String address,String phoneNumber, String email,int customerNumber, Gender gender ) {

        setName( title, firstName, lastName);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerNumber = customerNumber;
        this.gender = gender;
        this.isvalid = true;

        GregorianCalendar gCal = new GregorianCalendar();
        gCal.add(GregorianCalendar.YEAR,1);
        this.expiryDate = gCal.getTime();
    }

    private void setName(String title, String firstName, String lastName) {
        this.title = title;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMailingName() {
        //Ch14
        StringBuilder sb = new StringBuilder(title);
        sb.append(" ");
        sb.append(firstName.substring(0,1));
        sb.append(" ");
        sb.append(lastName);
        return sb.toString();

//        mailingName = title;
//        mailingName = mailingName.concat(" ");
//        String initial = firstName.substring(0, 1);
//        mailingName += initial;
//        mailingName += " ";
//        mailingName += lastName;
//        //+= means concat

        //return mailingName;
    }

    public Gender getGender() {
        return gender;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return getMailingName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return customerNumber == customer.customerNumber &&
                isvalid == customer.isvalid &&
                Objects.equals(title, customer.title) &&
                Objects.equals(firstName, customer.firstName) &&
                Objects.equals(lastName, customer.lastName) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(phoneNumber, customer.phoneNumber) &&
                Objects.equals(email, customer.email) &&
                gender == customer.gender &&
                Objects.equals(expiryDate, customer.expiryDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, firstName, lastName, address, phoneNumber, email, customerNumber, gender, isvalid, expiryDate);
    }
}

