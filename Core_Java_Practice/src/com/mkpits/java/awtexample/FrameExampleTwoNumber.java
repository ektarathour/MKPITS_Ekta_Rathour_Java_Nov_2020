//Another program to accept two number from the user and display the addition of 2 number
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FrameExampleTwoNumber extends Frame {
    FrameExampleTwoNumber() {
        Label l1 = new Label("num1");
        l1.setBounds(10, 40, 240, 25);
        add(l1);
        TextField t1 = new TextField();
        t1.setBounds(260, 40, 245, 25);
        add(t1);
        Label l2 = new Label("num2");
        l2.setBounds(10, 40, 240, 25);
        add(l2);
        TextField t2 = new TextField();
        t2.setBounds(260, 40, 245, 25);
        add(t2);
        Label l3 = new Label("num3");
        l3.setBounds(10, 40, 240, 25);
        add(l3);
        TextField t3 = new TextField();
        t3.setBounds(260, 40, 245, 25);
        add(t3);
        Button b1 = new Button("addition");
        b1.setBounds(100, 100, 80, 20);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String str1 = t1.getText();
                Double fn = Double.parseDouble(str1);
                Double sn = Double.parseDouble(t2.getText());
                t3.setText("sum is " + (fn + sn));
            }
        });
        add(b1);

        setSize(500, 500);
        setTitle("Calculator");
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        FrameExampleTwoNumber f = new FrameExampleTwoNumber();
    }
}




