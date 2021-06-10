// program to insert records in our employee table created.
package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ExOfJdbcProgramToInsertRecordInEmployeeTable {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("emter empid");
        int empid=sc.nextInt();
        System.out.println("emter empname");
        String empname=sc.next();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "");
            System.out.println("Connected successfully");
            stmt = con.createStatement();
            String str = "insert into employee(empid,empname)values("+empid+",'"+empname+"')";
            stmt.executeUpdate(str);
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }
}
