//create a program to delete record
package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExOfJdbcToDeleteRecord {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "");
            System.out.println("connected successfully");
            stmt = con.createStatement();
            String str="delete from student1  where srollno=2";
            stmt.executeUpdate(str);
            System.out.println("database updated successfully");
        } catch (Exception e) {
            System.out.println(e);

        }
    }
}

