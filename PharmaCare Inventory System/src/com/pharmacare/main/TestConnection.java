package com.pharmacare.main;

import com.pharmacare.db.DBConnection;
import java.sql.SQLException;

public class TestConnection {

    public static void main(String[] args) {
        try {
            // Get the connection instance
            DBConnection.getInstance().getConnection();
            
            // If it gets here without an error, the connection is successful!
            System.out.println("Wow! Database connected successfully!");
            
        } catch (ClassNotFoundException | SQLException e) {
            // If there's an error, print it
            System.out.println("Oops! Connection failed.");
            e.printStackTrace();
        }
    }
}