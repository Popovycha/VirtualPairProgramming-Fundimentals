package com.gmail.mybmcc22.models;

public abstract class Material {
    private int id;
    private String title;
    private String branch;
    private Customer borrower;//ch16

    public Material(int id, String title, String branch) {
        this.id = id;
        this.title = title;
        this.branch = branch;
    }

    public String getTitle() {
        return title;
    }

    public int getId() {
        return id;
    }
    public void relocate(String newBranch) {
        this.branch = newBranch;
    }

    public boolean lend(Customer customer) {
        if (borrower == null) {
            borrower = customer;
            return true;
        }
        else {
            return false;
        }
    }
    //must be overidden
    public  abstract int getLoanPeriod();

}
