package com.klu.MyMavenProject;

public class Prescription {

    private int prescriptionId;
    private int customerId;
    private String doctorName;
    private String medicineName;
    private int quantity;

    public Prescription(int prescriptionId, int customerId,
                        String doctorName, String medicineName,
                        int quantity) {

        this.prescriptionId = prescriptionId;
        this.customerId = customerId;
        this.doctorName = doctorName;
        this.medicineName = medicineName;
        this.quantity = quantity;
    }

    public int getPrescriptionId() {
        return prescriptionId;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Prescription ID: " + prescriptionId +
               ", Customer ID: " + customerId +
               ", Doctor: " + doctorName +
               ", Medicine: " + medicineName +
               ", Quantity: " + quantity;
    }
}