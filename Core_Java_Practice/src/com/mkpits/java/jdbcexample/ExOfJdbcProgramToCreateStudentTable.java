//-create a program to create table student
package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class ExOfJdbcProgramToCreateStudentTable {
    public static void main(String[] args){
        Connection con=null;
        Statement stmt=null;
        try{
        Class.forName("com.mysql.jdbc.Driver");
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
        System.out.println("Connected successfully ");
        stmt= con.createStatement();
        String str="Create table Student1(srollno int primary key,sname varchar(40))";
        stmt.executeUpdate(str);
        System.out.println("table created successfully");
        con.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
