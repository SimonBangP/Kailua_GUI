package com.example.kailua_gui.Model;

import java.util.Date;

public class Customer {
    private int customerID;
    private String firstname;
    private String lastname;
    private int addressID;
    private int phoneNumber;
    private String eMail;
    private Date birthday;

    public Customer(int customerID, String firstname, String lastname, int addressID, int phoneNumber, String eMail, Date birthday) {
        this.customerID = customerID;
        this.firstname = firstname;
        this.lastname = lastname;
        this.addressID = addressID;
        this.phoneNumber = phoneNumber;
        this.eMail = eMail;
        this.birthday = birthday;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getAddressID() {
        return addressID;
    }

    public void setAddressID(int addressID) {
        this.addressID = addressID;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}
