package com.Smart_NGO_DonationTracker_JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DonarDAO {

    
    public void addDonor(Donor donor) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO donor(name,amount,category) VALUES(?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, donor.getName());
            ps.setDouble(2, donor.getAmount());
            ps.setString(3, donor.getCategory());

            ps.executeUpdate();

            System.out.println("Donor Added Successfully!");

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   
    public void viewDonors() {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "SELECT * FROM donor";

            PreparedStatement ps = con.prepareStatement(sql);

            ResultSet rs = ps.executeQuery();

            System.out.println("===== DONOR LIST =====");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("name") + " | " +
                        rs.getDouble("amount") + " | " +
                        rs.getString("category")
                );
            }

            rs.close();
            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    
    public void deleteDonor(int id) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "DELETE FROM donor WHERE id = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Donor Deleted Successfully!");
            } else {
                System.out.println("Donor Not Found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

   
    public void updateDonor(int id, String name, double amount, String category) {

        try {
            Connection con = DBConnection.getConnection();

            String sql = "UPDATE donor SET name=?, amount=?, category=? WHERE id=?";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setDouble(2, amount);
            ps.setString(3, category);
            ps.setInt(4, id);

            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Donor Updated Successfully!");
            } else {
                System.out.println("Donor Not Found!");
            }

            ps.close();
            con.close();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}