package com.example.kailua_gui.Model;

import java.sql.Timestamp;

public class RentalContract {
    
    private String registrationNumber; 
    private int customerID; 
    private Timestamp startDateTime; 
    private Timestamp endDateTime; 
    private double price; 
    private int kilometers;

    public RentalContract(){}
    public RentalContract(String registrationNumber, int customerID, Timestamp startDateTime, Timestamp endDateTime, double price, int kilometers) {
        this.registrationNumber = registrationNumber;
        this.customerID = customerID;
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.price = price;
        this.kilometers = kilometers;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public Timestamp getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Timestamp startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Timestamp getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Timestamp endDateTime) {
        this.endDateTime = endDateTime;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getKilometers() {
        return kilometers;
    }

    public void setKilometers(int kilometers) {
        this.kilometers = kilometers;
    }
}
