package com.Smart_NGO_DonationTracker_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {

        try {

            String url = "jdbc:mysql://localhost:3306/ngo_tracker";
            String user = "root";
            String password = "YOUR_Password";

            Connection con =
                    DriverManager.getConnection(
                            url,
                            user,
                            password);

            return con;

        } catch (Exception e) {

            e.printStackTrace();
            return null;
        }
    }
}