package com.pluralsight.dataholders;

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

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getColor() {
        return color;
    }

    public int getVin() {
        return vin;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return  "Make: " + make +
                "\nModel: " + model +
                "\nVehicle Type: " + vehicleType +
                "\nColor: " + color +
                "\nVin: " + vin +
                "\nYear: " + year +
                "\nMileage: " + mileage +
                "\nPrice: " + price + "\n";
    }
}
