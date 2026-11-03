package com.klu.MyMavenProject;

public class Sale {

    private int saleId;
    private Customer customer;
    private Medicine medicine;
    private int quantity;

    public Sale(int saleId, Customer customer, Medicine medicine, int quantity) {
        this.saleId = saleId;
        this.customer = customer;
        this.medicine = medicine;
        this.quantity = quantity;
    }

    public double getTotalAmount() {
        return medicine.getPrice() * quantity;
    }

    @Override
    public String toString() {
        return "Sale ID: " + saleId +
               ", Customer: " + customer.getName() +
               ", Medicine: " + medicine.getName() +
               ", Quantity: " + quantity +
               ", Total Amount: ₹" + getTotalAmount();
    }
}