package com.gmail.mybmcc22;

public class Customer {
  private String title;
  private String FirstName;
  private String LastName;
  private String address;
  private String email;
  private Gender gender;
  private boolean isvalid;

  public Customer (String title, String FirstName, String LastName, String address, String email, Gender gender ) {

        setName( title, address, email, gender);
      this.address = address;
      this.email = email;

      this.isvalid = true;
  }

  public String getTitle() {
      return title;
  }
  public String getFirstName() {
      return FirstName;
  }
  public String getLastName() {
      return LastName;
  }
  private void setName(String title, String FirstName, String LastName, Gender gender) {
      this.title = title;
      this.FirstName = FirstName;
      this.LastName = LastName;
      this.gender = gender;


  }

  public String getMailingName() {
      String mailingName;
      mailingName = title + " " + FirstName + " " + LastName;
      return mailingName;
  }

    public Gender getGender() {
        return gender;
    }
}
