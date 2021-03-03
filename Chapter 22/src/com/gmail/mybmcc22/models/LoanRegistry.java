package com.gmail.mybmcc22.models;

import com.gmail.mybmcc22.utilities.LoanStatus;

import java.util.ArrayList;

public class LoanRegistry {

    private ArrayList<Loan> registry;



    public LoanRegistry() {
        registry = new ArrayList<Loan>();

    }

    public void addLoan(Loan loan) throws LoanAlreadyExistsException {

        if (registry.contains(loan)) //matched with loan that were passed in
        {
            throw new LoanAlreadyExistsException();
        }
        registry.add(loan);
    }

    public Loan findLoan(String bookID) throws LoanNotFoundException {

        for (Loan loan : registry) {
            if (loan.getBook().getId().equals(bookID) && loan.getStatus() == LoanStatus.CURRENT) {
                return loan;
            }
        }
        throw  new LoanNotFoundException();
    }

    public boolean isBookOnLoan(String bookID) {

        try {
            Loan foundLoan = findLoan(bookID);
            return true;
        }
        catch (LoanNotFoundException e) {
            return false;
        }
    }
}
