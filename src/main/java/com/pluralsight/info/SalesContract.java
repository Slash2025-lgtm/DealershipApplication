package com.pluralsight.info;

import com.pluralsight.dataholders.Dealership;
import com.pluralsight.dataholders.DealershipFileManager;
import com.pluralsight.dataholders.Vehicle;

import java.util.List;

public class SalesContract extends Contact {
    protected double salesTax, recordingFee, processingFee;
    protected boolean finance;

    public SalesContract(String customerName, String email, boolean vehicleSold, double totalPrice, double monthlyPayment, double salesTax, double recordingFee, double processingFee, boolean finance) {
        super(customerName, email, vehicleSold, totalPrice, monthlyPayment);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
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
