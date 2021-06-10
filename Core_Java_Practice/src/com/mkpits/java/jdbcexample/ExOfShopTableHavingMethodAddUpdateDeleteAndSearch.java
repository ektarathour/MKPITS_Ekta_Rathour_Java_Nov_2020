//Create a class shop having method to add,update,delete and search from shoptable
package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExOfShopTableHavingMethodAddUpdateDeleteAndSearch {
    int shop_no;
    String city;
    String owner;
    String address;
    Connection con=null;
    Statement stmt=null;
    public void connect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");

        }catch (Exception ee ) {
            System.out.println(ee.toString());
        }
    }
    public String addExOfShopTableHavingMethodAddUpdateDeleteAndSearch(int shop_no,String city,String owner,String
            address) {
        this.shop_no=shop_no;
        this.city=city;
        this.owner=owner;
        this.address=address;
        try {
            connect();
            String str = "insert into shop values(" + shop_no + ",'" + city +
                    "','" + owner + "','" + address + "')";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop added successfully";
        }catch ( Exception ee) {
            return ee.toString();
        }
    }
    public String updateExOfShopTableHavingMethodAddUpdateDeleteAndSearch(int shop_no,String city,String owner,String
            address) {
        this.shop_no=shop_no;
        this.city=city;
        this.owner=owner;
        this.address=address;
        try {
            connect();
            String str = "update shop set city='" + city + "',owner='" +
                    owner + "',address='" + address + "' where shop_no="+shop_no+"";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop updated successfully";
        }catch ( Exception ee) {
            return ee.toString();

        }
    }
    public String removeExOfShopTableHavingMethodAddUpdateDeleteAndSearch(int shop_no) {
        this.shop_no=shop_no;
        try {
            connect();
            String str = "delete from shop where shop_no="+shop_no+"";
            stmt = con.createStatement();
            stmt.executeUpdate(str);
            stmt.close();
            con.close();
            return "Shop removed successfully";
        }catch ( Exception ee) {
            return ee.toString();
        }
    }
    public String searchExOfShopTableHavingMethodAddUpdateDeleteAndSearch(int shop_no) {
        this.shop_no=shop_no;
        int flag=0;
        String res=null;
        try {
            connect();
            String str = "select * from shop where shop_no="+shop_no+"";
            stmt = con.createStatement();
            ResultSet rs= stmt.executeQuery(str);
            while (rs.next()) {
                flag=1;
                this.city=rs.getString("city");
                this.owner=rs.getString("owner");
                this.address=rs.getString("address");
            }
            rs.close();
            stmt.close();
            con.close();
            if(flag==0) {
                res="No record found";
            }
            return res;
        }catch ( Exception ee) {
            return ee.toString();
        }
    }
}
