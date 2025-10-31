package com.pluralsight.info;

public class Contact {

    public String customerName, email;
    public boolean vehicleSold;
    public double totalPrice, monthlyPayment;

    public Contact(String customerName, String email, boolean vehicleSold, double totalPrice, double monthlyPayment) {
        this.customerName = customerName;
        this.email = email;
        this.vehicleSold = vehicleSold;
        this.totalPrice = totalPrice;
        this.monthlyPayment = monthlyPayment;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isVehicleSold() {
        return vehicleSold;
    }

    public void setVehicleSold(boolean vehicleSold) {
        this.vehicleSold = vehicleSold;
    }

    public double getTotalPrice() {
        return 0;
    }

    public double getMonthlyPayment() {
        return 0;
    }
}
