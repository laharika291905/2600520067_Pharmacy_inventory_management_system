
package com.klu.MyMavenProject;

public class Test {

    public static void main(String[] args) {

        // Creating Customer
        Customer c = new Customer(101, "Ravi", "9876543210", "Vijayawada");

        // Creating Supplier
        Supplier s = new Supplier(201, "Kumar", "9876501234", "ABC Medicals");

        // Creating Medicine
        Medicine m = new Medicine(301, "Paracetamol", 10.0, 100, "2027-12-31");

        // Creating Prescription
        Prescription p = new Prescription(401, 101, "Dr. Ramesh", "Paracetamol", 2);

        // Creating Sale
        Sale sale = new Sale(501, c, m, 5);

        // Displaying details
        System.out.println("PHARMACY INVENTORY MANAGEMENT SYSTEM");

        System.out.println("\nCustomer Details:");
        System.out.println(c);

        System.out.println("\nSupplier Details:");
        System.out.println(s);

        System.out.println("\nMedicine Details:");
        System.out.println(m);

        System.out.println("\nPrescription Details:");
        System.out.println(p);

        System.out.println("\nSale Details:");
        System.out.println(sale);

        System.out.println("\nTotal Amount: " + sale.getTotalAmount());
    }
}
