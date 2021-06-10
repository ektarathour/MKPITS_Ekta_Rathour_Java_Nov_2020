//create a program to insert records into company table.(accept the value from the user
package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class ExOfInsertRecordInCompanyTable {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        Scanner sc=new Scanner(System.in);
        System.out.println("emter emp_id");
        int emp_id=sc.nextInt();
        System.out.println("emter first_name");
        String first_name=sc.next();
        System.out.println("emter last_name");
        String last_name=sc.next();
        System.out.println("emter birth_date");
        String birth_date=sc.next();
        System.out.println("emter sex");
        String sex=sc.next();
        System.out.println("emter salary");
        int salary=sc.nextInt();
        System.out.println("emter super_id");
        int super_id =sc.nextInt();
        System.out.println("emter branch_id");
        int branch_id =sc.nextInt();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb", "root", "");
            System.out.println("Connected successfully");
            stmt = con.createStatement();
            String str = "insert into employee1(emp_id,first_name,last_name,birth_date,sex,salary,super_id,branch_id)" +
                    "values("+emp_id+",'"+first_name+"','"+last_name+"','"+birth_date+"','"+sex+"','"+salary+"','"+super_id+"','"+branch_id+"')";
            stmt.executeUpdate(str);
        } catch (Exception e) {
            System.out.println(e.toString());

        }
    }
}


