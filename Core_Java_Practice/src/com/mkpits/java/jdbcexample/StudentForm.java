//Another example of create student using swing
package com.mkpits.java.jdbcexample;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentForm extends JFrame{

    JRadioButton rb1, rb2;
    JCheckBox hb1, hb2;
    ButtonGroup bg;
    JComboBox course;
    private String hobby;

    StudentForm() {
        JLabel l14 = new JLabel("Student form");
        l14.setBounds(100, 40, 240, 25);
        add(l14);
        JLabel l1=new JLabel("Student Name");
        l1.setBounds(10,80,240,25);
        add(l1);
        JTextField t1=new JTextField();
        t1.setBounds(260,80,240,25);
        add(t1);
        JLabel l2=new JLabel("Address");
        l2.setBounds(10,120,240,25);
        add(l2);
        JPasswordField t2=new JPasswordField( );
         t2.setBounds(260,120,240,25);
        add(t2);
        JLabel lg=new JLabel("gender");
        lg.setBounds(10,120,240,25);
        add(lg);
        rb1=new JRadioButton("male" );
        rb1.setBounds(260,160,100,25);
        add(rb1);
        rb2=new JRadioButton("female" );
        rb2.setBounds(400,160,100,25);
        add(rb2);
        bg=new ButtonGroup();
        bg.add(rb1);
        bg.add(rb2);
        JLabel lc=new JLabel("Hobby ");
        lg.setBounds(10,200,240,25);
        add(lg);
        hb1=new JCheckBox("music" );
        hb1.setBounds(260,200,100,25);
        add(hb1);
        hb2=new JCheckBox("reading" );
        hb2.setBounds(400,200,100,25);
        add(hb2);
        JLabel lci=new JLabel("course");
        lci.setBounds(10,240,240,25);
        add(lci);
        String[] ct= { "java","oracle","mysql"};

        course=new JComboBox(ct);
        course.setBounds(260,240,100,25);
        add(course);
        JLabel l21=new JLabel("Status");
        l21.setBounds(10,400,240,25);
        add(l21);

        JButton b1=new JButton("save");

        b1.setBounds(100,360,80,20);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sn = t1.getText();
                String add = t2.getText();
                String g=null;
                if(rb1.isSelected())
                    g="male";
                else if (rb2.isSelected())
                    g="female";
                System.out.println("gender " +g);
                String course=null;
                if(hb1.isSelected())
                    course="java";
                if (hb2.isSelected())
                    course = course + "C";
               // String course1 = course.getSelectedItem().toString();

                Connection con;
                Statement st=null;
                try {
                    Class.forName("com.mysql.jdbc.Driver");
                    con= DriverManager.getConnection("jdbc:mysql://localhost:3306/Sampledb","root","");


                    st=con.createStatement();



                    String sql="insert into student(studentname,address,gender,hobby,course) values('"+sn+"','"+add+"','"+g+"','"+hobby+"','"+course+"')";
                   st.executeUpdate(sql);
                    l21.setText("registered successfully");
                    t1.setText("");
                    t2.setText("");
                    st.close();
                    con.close();
                }catch ( Exception ee)
                {
                    System.out.println(ee.toString());
                }
            }
        });
        add(b1);

        setSize(700,500);
        setTitle("student detail");
        setLayout(null);
        setVisible(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent windowEvent){
                System.exit(0);
            }
        });
    }
    public static void main(String[] arg)
    {
        StudentForm f=new StudentForm();
    }
    }



































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































































