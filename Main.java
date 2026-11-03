
package com.klu.MyMavenProject;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        System.out.println(" PHARMACY MANAGEMENT SYSTEM");
        System.out.println("================================");

        System.out.println("1. Customer Management");
        System.out.println("2. Supplier Management");
        System.out.println("3. Medicine Management");
        System.out.println("4. Prescription Management");
        System.out.println("5. Sales Management");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.println("Customer Management Selected");
                break;

            case 2:
                System.out.println("Supplier Management Selected");
                break;

            case 3:
                System.out.println("Medicine Management Selected");
                break;

            case 4:
                System.out.println("Prescription Management Selected");
                break;

            case 5:
                System.out.println("Sales Management Selected");
                break;

            case 6:
                System.out.println("Thank you for using Pharmacy System!");
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}

