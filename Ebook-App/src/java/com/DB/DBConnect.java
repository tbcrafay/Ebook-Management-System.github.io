/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.DB;

/**
 *
 * @author Abdul Rafay
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    private static Connection conn;

    public static Connection getConn() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebook-app", "root", "rafay123");
            System.out.println("Connection established successfully!");

        } catch (Exception e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }

        return conn;
    }

}
