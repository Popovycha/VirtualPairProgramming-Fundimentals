package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.utilities.LoanStatus;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Objects;

public class Loan {
    private int ID;
    private Customer customer;
    private Book book;
    private Date startDate;
    private Date dueDate;
    private Date returnDate;
    private LoanStatus status;

    public Loan(int ID, Customer customer, Book book) {
        this.ID = ID;
        this.customer = customer;
        this.book = book;
        startDate = new Date();

        GregorianCalendar gCal = new GregorianCalendar();
        gCal.add(GregorianCalendar.DAY_OF_MONTH,14);
        this.dueDate = gCal.getTime();

        status = LoanStatus.CURRENT;
    }

    public void setLoanStatus(LoanStatus loanStatus) {
        this.status = loanStatus;
        loanStatus = LoanStatus.CURRENT;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + ID +
                ", customer=" + customer.getMailingName() +
                ", book=" + book.getTitle() +
                '}';
    }

    //TODO: return to true?
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return ID == loan.ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Book getBook() {
        return book;
    }

    public Date getDueDate() {
        return dueDate;
    }
    public LoanStatus getStatus() {
        return status;
    }
    //TODO: endLoan implementation?
    public void  endLoan() {
        returnDate = new Date();
        status = LoanStatus.HISTORIC;
    }
}
