package com.pluralsight;

public class Vehicle {
    private String make, model, vehicleType, color;
    private int vin, year, mileage;
    private double price;

    public Vehicle(int vin, int year, String make, String model, String vehicleType, String color, int mileage, double price) {
        this.vin = vin;
        this.year = year;
        this.make = make;
        this.model = model;
        this.vehicleType = vehicleType;
        this.color = color;
        this.mileage = mileage;
        this.price = price;
    }


}
