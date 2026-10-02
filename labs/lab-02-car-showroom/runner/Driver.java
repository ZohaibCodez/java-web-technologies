package runner;

import showroom.*;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Sedan(1, "Corolla X", "White", "Toyota", "65 Lakh");
        vehicles[1] = new Sedan(2, "City Aspire", "Black", "Honda", "58 Lakh");
        vehicles[2] = new Sedan(3, "Alsvin", "Blue", "Changan", "48 Lakh");

        vehicles[3] = new SUV(4, "Fortuner", "White", "Toyota", "2.1 Crore");
        vehicles[4] = new SUV(5, "BR-V", "Silver", "Honda", "85 Lakh");
        vehicles[5] = new SUV(6, "Oshan X7", "Black", "Changan", "90 Lakh");

        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- Car Showroom Menu ---");
            System.out.println("1. Show All Vehicles");
            System.out.println("2. Show Only Sedan");
            System.out.println("3. Show Only SUV");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n--- All Vehicles ---");
                    for (Vehicle v : vehicles) {
                        System.out.println(v.toString());
                    }
                    break;
                case 2:
                    System.out.println("\n--- Sedan Information ---");
                    for (Vehicle v : vehicles) {
                        if (v instanceof Sedan) {
                            System.out.println(v.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n--- SUV Information ---");
                    for (Vehicle v : vehicles) {
                        if (v instanceof SUV) {
                            System.out.println(v.toString());
                        }
                    }
                    break;
                case 0:
                    System.out.println("Thank you for visiting!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice!= 0);

        sc.close();
    }
}