package com.pharmacare.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    // 1. private static variable for the single instance
    private static DBConnection dbConnection;
    private Connection connection;

    // 2. private constructor to prevent creating new instances
    private DBConnection() throws ClassNotFoundException, SQLException {
        // Load the driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        // Create the connection
        connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/pharmacare_db", // Your DB URL
                "root", // Your DB Username (XAMPP default is root)
                "12345678" // Your DB Password (XAMPP default is empty)
        );
    }

    // 3. public static method to get the single instance
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException {
        if (dbConnection == null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

    // Method to get the actual connection object
    public Connection getConnection() {
        return connection;
    }
}