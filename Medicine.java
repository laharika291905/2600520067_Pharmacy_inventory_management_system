package com.klu.MyMavenProject;

import java.util.Objects;

public class Medicine {

    private int medicineId;
    private String name;
    private double price;
    private int quantity;
    private String expiryDate;

    public Medicine(int medicineId, String name,
                    double price, int quantity,
                    String expiryDate) {

        this.medicineId = medicineId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
    }

    public int getMedicineId() {
        return medicineId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Medicine ID: " + medicineId +
               ", Name: " + name +
               ", Price: " + price +
               ", Quantity: " + quantity +
               ", Expiry Date: " + expiryDate;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;

        if (!(obj instanceof Medicine))
            return false;

        Medicine other = (Medicine) obj;

        return medicineId == other.medicineId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(medicineId);
    }
}