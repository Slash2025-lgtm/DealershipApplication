package com.pluralsight.info;

public class LeaseContract extends Contact {
    protected double expectedEndingValue, leaseFee;

    public LeaseContract(String customerName, String email, boolean vehicleSold, double totalPrice, double monthlyPayment, double expectedEndingValue, double leaseFee) {
        super(customerName, email, vehicleSold, totalPrice, monthlyPayment);
        this.expectedEndingValue = expectedEndingValue;
        this.leaseFee = leaseFee;
    }

    public double getExpectedEndingValue() {
        return expectedEndingValue;
    }

    public void setExpectedEndingValue(double expectedEndingValue) {
        this.expectedEndingValue = expectedEndingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }

    @Override
    public double getTotalPrice() {
        return super.getTotalPrice();
    }

    @Override
    public double getMonthlyPayment() {
        return super.getMonthlyPayment();
    }
}
