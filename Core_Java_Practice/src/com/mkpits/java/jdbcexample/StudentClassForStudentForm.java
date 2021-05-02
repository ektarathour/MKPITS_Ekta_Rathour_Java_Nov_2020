//java program having student class to demonstrate how to create student from having student name,address gender
// hobby course using swing
package com.mkpits.java.jdbcexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentClassForStudentForm {
    private String StudentName, Address, Gender, Course, Hobby;
    public void setStudentName(String StudentName) {
        this.StudentName = StudentName;
    }
    public void setAddress(String Address) {
        this.Address = Address;
    }
    public void setGender(String Gender) {
        this.Gender = Gender;
    }
    public void setCourse(String Course) {
        this.Course = Course;
    }
    public void setHobby(String Hobby) {
        this.Hobby = Hobby;
    }
    public String saveregister() {
        Connection con;
        Statement st = null;
        String str = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Sampledb","root","");
            System.out.println("connected");
            st = con.createStatement();

            String add = null;
            String sn = null;
            String hobby = null;
            String g = null;
            String course = null;
            String sql="insert into student(studentname,address,gender,hobby,course) values('"+sn+"','"+add+"','"+g+"','"+hobby+"','"+course+"')";

            st.executeUpdate(sql);
            str = "registered successfully";
            st.close();
            con.close();
        } catch (Exception ee) {
            str = ee.toString();
            System.out.println(str);
        } finally {
        }
        return str;
    }
}

