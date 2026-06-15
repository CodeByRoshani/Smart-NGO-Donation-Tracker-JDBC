package com.Smart_NGO_DonationTracker_JDBC;

import java.sql.Connection;

public class Connectiontest {

    public static void main(String[] args) {

        Connection con = DBConnection.getConnection();

        if (con != null) {
            System.out.println("Database Connected Successfully");
        } else {
            System.out.println("Connection Failed");
        }
    }
}
