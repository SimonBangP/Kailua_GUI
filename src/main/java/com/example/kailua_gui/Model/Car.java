package com.example.kailua_gui.Model;

import com.example.kailua_gui.StringConverter;

import java.util.Date;
import java.util.List;

// Test test
public class Car {
    private String registrationNumber;
    private String carType;
    private String brand;
    private String model;
    private String variant;
    private double pricePerKilometer;
    private int engineSize;
    private int horsePower;
    private String fuelType;
    private Date registrationDate;
    private int odometer;
    private List<String> features;

    public Car (){}

    public Car(String registrationNumber, String carType, String brand, String model, String variant, double pricePerKilometer,
               int engineSize, int horsePower, String fuelType, Date registrationDate, int odometer, List<String> features) {
        this.registrationNumber = registrationNumber;
        this.carType = carType;
        this.brand = brand;
        this.model = model;
        this.variant = variant;
        this.pricePerKilometer = pricePerKilometer;
        this.engineSize = engineSize;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
        this.registrationDate = registrationDate;
        this.odometer = odometer;
        this.features = features;
    }

    public Car(DMRCar newCar, double pricePerKilometer) {
        this.brand = newCar.getMaerkeTypeNavn();
        this.model = newCar.getModelTypeNavn();
        this.variant = newCar.getVariantTypeNavn();
        this.registrationDate = StringConverter.toDateFromDMRDate(newCar.getFoersteRegistreringDato());
        this.registrationNumber = newCar.getRegNr();
        this.odometer = newCar.getMotorKilometerstand() * 1000;
        this.engineSize = (int)newCar.getMotorSlagVolumen();
        this.horsePower = newCar.getMotorHestekraefter();
        this.fuelType = newCar.getDrivkraftTypeNavn();
        this.features = newCar.getKoeretoejUdstyrSamling();
        this.pricePerKilometer = pricePerKilometer;
    }

    public String getRegistrationNumber() { return registrationNumber;}
    public void setRegistrationNumber(String registrationNumber) { this.registrationNumber = registrationNumber; }
    public String getCarType() {return carType;}
    public void setCarType(String carType) {this.carType = carType;}
    public String getBrand() {return brand;}
    public void setBrand(String brand) {this.brand = brand;}
    public String getModel() {return model;}
    public void setModel(String model) {this.model = model;}
    public String getVariant() {return variant;}
    public void setVariant(String variant) {this.variant = variant;}
    public double getPricePerKilometer() {return pricePerKilometer;}
    public void setPricePerKilometer(double pricePerKilometer) {this.pricePerKilometer = pricePerKilometer;}
    public int getEngineSize() {return engineSize;}
    public void setEngineSize(int engineSize) {this.engineSize = engineSize;}
    public int getHorsePower() {return horsePower;}
    public void setHorsePower(int horsePower) {this.horsePower = horsePower;}
    public String getFuelType() {return fuelType;}
    public void setFuelType(String fuelType) {this.fuelType = fuelType;}
    public Date getRegistrationDate() {return registrationDate;}
    public void setRegistrationDate(Date registrationDate) {this.registrationDate = registrationDate;}
    public int getOdometer() {return odometer;}
    public void setOdometer(int odometer) {this.odometer = odometer;}
    public List<String> getFeatures() {return features;}
    public void setFeatures(List<String> features) {this.features = features;}
}
