package com.mkpits.java.jdbcexamples;
import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcExample1 {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/testdb","root","sa");
//here sonoo is database name, root is username and password
            System.out.println("conncect");
            con.close();
        }
        catch(Exception e){ System.out.println(e);}
    }

}

