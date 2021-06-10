//Create a jdbc program to connect to mysql database.

package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/sampledb", "root", "");

             System.out.println("connect");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}


