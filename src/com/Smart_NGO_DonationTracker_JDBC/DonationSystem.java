package com.Smart_NGO_DonationTracker_JDBC;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DonationSystem {

    static Scanner sc = new Scanner(System.in);

    //  ArrayList storage (offline mode)
    static List<Donor> donars = new ArrayList<>();

    //  DAO object
    static DonarDAO dao = new DonarDAO();

    // ================= ADD =================
    static void AddDonar() {

        System.out.println("Please Enter The Donor Name:");
        String name = sc.nextLine();

        System.out.println("Please Enter The Donation Amount:");
        double amount = sc.nextDouble();
        sc.nextLine();

        System.out.println("Please Enter The Donation Category:");
        String category = sc.nextLine();

        Donor d = new Donor(name, amount, category);

        //  JDBC SAVE
        dao.addDonor(d);

        //  ArrayList SAVE
        donars.add(d);
    }

    // ================= VIEW =================
    static void viewDonar() {

        System.out.println("\nChoose Mode:");
        System.out.println("1. View from ArrayList");
        System.out.println("2. View from Database");

        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {

            if (donars.isEmpty()) {
                System.out.println("There is no donor (ArrayList)");
            } else {
                for (Donor donor : donars) {
                    System.out.println(donor);
                }
            }

        } else if (opt == 2) {

            dao.viewDonors();

        } else {
            System.out.println("Invalid Choice!");
        }
    }

    // ================= SEARCH (ARRAYLIST ONLY) =================
    static void SearchDonar() {

        System.out.println("Enter the Donor Name:");
        String donarName = sc.nextLine();

        boolean found = false;

        for (Donor donor : donars) {

            if (donor.getName().equalsIgnoreCase(donarName)) {
                System.out.println(donor);
                found = true;
            }
        }

        if (!found) {
            System.out.println("There is no donor named " + donarName);
        }
    }

    // ================= DELETE =================
    static void deletDonar() {

        System.out.println("Choose Delete Mode:");
        System.out.println("1. Delete from ArrayList");
        System.out.println("2. Delete from Database");

        int opt = sc.nextInt();
        sc.nextLine();

        if (opt == 1) {

            System.out.println("Enter Donor Name:");

            String deletName = sc.nextLine();

            boolean f = false;

            for (int i = 0; i < donars.size(); i++) {

                if (donars.get(i).getName().equalsIgnoreCase(deletName)) {

                    donars.remove(i);
                    f = true;
                    break;
                }
            }

            if (f) {
                System.out.println("Deleted from ArrayList!");
            } else {
                System.out.println("Donor Not Found");
            }

        } else if (opt == 2) {

            System.out.println("Enter Donor ID:");
            int id = sc.nextInt();
            sc.nextLine();

            dao.deleteDonor(id);

        } else {
            System.out.println("Invalid Choice!");
        }
    }

    // ================= TOTAL =================
    static void totalDonation() {

        double total = 0;

        for (Donor d : donars) {
            total += d.getAmount();
        }

        System.out.println("=== Total Amount  ===");
        System.out.println(total);
    }

    // ================= MAIN =================
    public static void main(String[] args) {

        int choice;

        do {

            System.out.println("\n========= MENU =========");
            System.out.println("1. Add Donor");
            System.out.println("2. View Donor");
            System.out.println("3. Search Donor");
            System.out.println("4. Delete Donor");
            System.out.println("5. Total Donation");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1 -> AddDonar();
                case 2 -> viewDonar();
                case 3 -> SearchDonar();
                case 4 -> deletDonar();
                case 5 -> totalDonation();
                case 6 -> System.out.println("Exiting system...");
                default -> System.out.println("Enter valid number (1-6)");
            }

        } while (choice != 6);

        sc.close();
    }
}