package com.example.kailua_gui.Model;

import java.sql.Date;

public class RentalContract {


    private int rentalContractID;
    private String registrationNumber; 
    private int customerID; 
    private Date startDate;
    private Date endDate;
    private double price; 
    private int kilometers;

    public RentalContract(){}
    public RentalContract(int rentalContractID, String registrationNumber, int customerID, Date startDate, Date endDate, double price, int kilometers) {
        this.rentalContractID = rentalContractID;
        this.registrationNumber = registrationNumber;
        this.customerID = customerID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.price = price;
        this.kilometers = kilometers;
    }

    public int getRentalContractID() {return rentalContractID;}
    public void setRentalContractID(int rentalContractID) {this.rentalContractID = rentalContractID;}

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

    public Date getStartDate() {
        return startDate;
    }
    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }
    public void setEndDate(Date endDate) {
        this.endDate = endDate;
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
