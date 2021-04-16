//Example of registration form using checkbox
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CheckboxGroupExample {
    Label l1, l2, l3, l4;
    TextField tf;
    Button b1;

    CheckboxGroupExample() {

        Frame f = new Frame("CheckboxGroupExample");
        l1 = new Label("register youself");
        l1.setBounds(200, 50, 100, 20);
        f.add(l1);
        l2 = new Label("your name");
        l2.setBounds(10, 120, 100, 20);
        f.add(l2);
        tf = new TextField();
        tf.setBounds(130, 120, 100, 20);
        f.add(tf);
        l3 = new Label("Select course");
        l3.setBounds(10, 170, 100, 20);
        f.add(l3);
        Checkbox checkBox1 = new Checkbox("C++", false);
        checkBox1.setBounds(130, 150, 50, 50);
        Checkbox checkBox2 = new Checkbox("Java", true);
        checkBox1.setBounds(200, 150, 50, 50);

        f.add(checkBox1);
        f.add(checkBox2);
        l4 = new Label("Select gender");
        l4.setBounds(10, 210, 100, 20);
        f.add(l4);
        CheckboxGroup cbg1 = new CheckboxGroup();
        Checkbox checkBox11 = new Checkbox("Male", cbg1, false);
        checkBox11.setBounds(120, 200, 50, 50);
        Checkbox checkBox22 = new Checkbox("Female", cbg1, true);
        checkBox22.setBounds(180, 200, 50, 50);
        f.add(checkBox1);
        f.add(checkBox2);
        f.add(checkBox11);
        f.add(checkBox22);
        Label l5 = new Label("Select city");
        l5.setBounds(10, 260, 100, 20);
        f.add(l5);
        Choice c = new Choice();
        c.setBounds(120, 260, 100, 75);
        c.add("Nagpur");
        c.add("Mumbai");
        c.add("Delhi");
        f.add(c);
        Label l11 = new Label("Name");
        l11.setBounds(10, 390, 200, 30);
        f.add(l11);
        Label l12 = new Label("Name");
        l12.setBounds(10, 430, 200, 30);
        f.add(l12);
        Label l13 = new Label("Name");
        l13.setBounds(10, 470, 200, 30);
        f.add(l13);
        Label l14 = new Label("Name");
        l14.setBounds(10, 470, 200, 30);
        f.add(l14);
        Button b1 = new Button("click me");
        b1.setBounds(100, 350, 100, 30);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                l11.setText("name is" + tf.getText());
                StringBuilder sb=new StringBuilder();
                sb.append("course selected");
                if(checkBox1.getState()==true) {
                    sb.append(" c++");
                }
                if (checkBox2.getState()==true) {
                    sb.append(" java");
                }
                l12.setText(sb.toString());

                StringBuilder sb1=new
                        StringBuilder();
                sb1.append("gender selected :");
                if(checkBox11.getState()==true) {
                    sb1.append(" male ");
                }
                if (checkBox22.getState()==true) {
                    sb1.append(" female ");


                }
                l13.setText(sb1.toString());
                l14.setText("\ncity Selected: "+

                        c.getItem(c.getSelectedIndex()));
            }
        });
        f.add(b1);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new CheckboxGroupExample();
    }
}







