package com.wholesale;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/wholesale_db";
        String user = "root";  // Change to your MySQL username
        String password = "12345678";  // Change to your MySQL password

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Database connected successfully!");
        } catch (SQLException e) {
            System.out.println("Database connection failed.");
            e.printStackTrace();
        }
    }
}
