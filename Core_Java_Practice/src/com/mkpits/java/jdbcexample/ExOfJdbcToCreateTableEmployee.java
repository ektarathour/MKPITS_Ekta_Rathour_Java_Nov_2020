//create a jdbc program to create table into the database.
package com.mkpits.java.jdbcexample;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class ExOfJdbcToCreateTableEmployee {
    public static void main(String[] args) {
        Connection con=null;
        Statement stmt=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");

             con = DriverManager.getConnection
                    ("jdbc:mysql://localhost:3306/sampledb","root","");

            System.out.println("connected successfully");
            stmt=con.createStatement();
            String str="create table employee(empid int primary key,empname varchar(40))";
            stmt.executeUpdate(str);
            System.out.println("table successfully created");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
