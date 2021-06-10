//create a swing form
//to insert ,update and delete and search records into supplier table.
package com.mkpits.java.jdbcexample;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ExOfInsetUpdateDeleteAndSearchRecordInSupplierTableUsingSwing extends JFrame{
    JLabel l1,l2,l3,l4,l5;
    JTextField t1,t2,t3,t4;
    JButton  b1,b2,b3,b4;
    Connection con = null;
    Statement stmt = null;
    public ExOfInsetUpdateDeleteAndSearchRecordInSupplierTableUsingSwing(){
        l1=new JLabel("s_id.");
        l1.setBounds(20,50,200,20);
        add(l1);
        t1=new JTextField();
        t1.setBounds(230,50,200,20);
        add(t1);
        l2=new JLabel("s_company.");
        l2.setBounds(20,100,200,20);
        add(l2);
        t2=new JTextField();
        t2.setBounds(230,100,200,20);
        add(t2);
        b1=new JButton("Save");
        b1.setBounds(100,250,100,30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");

                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root", "");
                    stmt=con.createStatement();
                    String str="insert into supplier values('"+t1.getText()+"','"+t2.getText()+"')";
                    stmt.executeUpdate(str);
                    con.close();
                    l5.setText("record inserted successfully");
                    t1.setText("");
                    t2.setText("");


                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b1);
        b2=new JButton("Update");
        b2.setBounds(220,250,100,30);
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
                    stmt=con.createStatement();
                    String str="update supplier set s_id='"+t2.getText()+"'where s_id='"+t1.getText()+"'";
                    stmt.executeUpdate(str);

                    con.close();
                    l5.setText("record updated successfully");
                    t1.setText("");
                    t2.setText("");


                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b2);
        b3=new JButton("Delete");
        b3.setBounds(330,250,100,30);
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
                    stmt=con.createStatement();

                    String str="delete from supplier where s_id='"+t1.getText()+"'";
                     stmt.executeUpdate(str);

                    con.close();
                    l5.setText("record deleted successfully");
                    t1.setText("");
                    t2.setText("");


                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b3);
        b4=new JButton("Search");
        b4.setBounds(450,50,100,30);
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/sampledb","root","");
                    stmt=con.createStatement();

                    String str="select * from supplier where s_id='"+t1.getText()+"'";
                    ResultSet rs= stmt.executeQuery(str);
                    int flag=0;
                    while(rs.next()) {
                        flag=1;
                        t2.setText(rs.getString("s_id"));

                    }
                    if(flag==0) {
                        l5.setText("record not found");

                        t2.setText("");


                    }
                    rs.close();
                    con.close();

                }catch ( Exception ee) {
                    l5.setText(ee.toString());
                }
            }
        });
        add(b4);

        l5=new JLabel("Status.");
        l5.setBounds(10,300,400,20);
        add(l5);

        setTitle("supplier form");
        setSize(600,400);
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        ExOfInsetUpdateDeleteAndSearchRecordInSupplierTableUsingSwing st=
                new ExOfInsetUpdateDeleteAndSearchRecordInSupplierTableUsingSwing();
    }

}
