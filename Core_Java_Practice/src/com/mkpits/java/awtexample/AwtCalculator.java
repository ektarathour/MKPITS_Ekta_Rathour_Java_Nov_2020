//simple example of calculator
package com.mkpits.java.awtexample;

import java.awt.*;

public class AwtCalculator extends Frame{
        AwtCalculator() {
            TextField t1 = new TextField();
            t1.setBounds(10, 40, 240, 25);
            add(t1);
            Button b1 = new Button("1");
            Button b2 = new Button("2");
            Button b3 = new Button("3");
            Button b4 = new Button("4");
            Button b5 = new Button("5");
            Button b6 = new Button("6");
            Button b7 = new Button("7");
            Button b8 = new Button("8");
            Button b9 = new Button("9");
            Button b10 = new Button(".");
            Button b11 = new Button("0");
            Button b12 = new Button("=");
            Button b13 = new Button("+");
            Button b14 = new Button("-");
            Button b15 = new Button("/");
            Button b16 = new Button("%");
            Button b17 = new Button("*");
            Button b18 = new Button("@");
            b1.setBounds(10, 50, 80, 50);
            add(b1);
            b2.setBounds(90, 50, 80, 50);
            add(b2);
            b3.setBounds(170, 50, 80, 50);
            add(b3);
            b4.setBounds(10, 90, 80, 50);
            add(b4);
            b5.setBounds(90, 90, 80, 50);
            add(b5);
            b6.setBounds(170, 90, 80, 50);
            add(b6);
            b7.setBounds(10, 140, 80, 50);
            add(b7);
            b8.setBounds(90, 140, 80, 50);
            add(b8);
            b9.setBounds(170, 140, 80, 50);
            add(b9);
            b10.setBounds(170, 180, 80, 50);
            add(b10);
            b11.setBounds(10, 180, 80, 50);
            add(b11);
            b12.setBounds(90, 180, 80, 50);
            add(b12);
            b13.setBounds(170, 220, 80, 50);
            add(b13);
            b14.setBounds(10, 220, 80, 50);
            add(b14);
            b15.setBounds(90, 220, 80, 50);
            add(b15);
            b16.setBounds(170, 260, 80, 50);
            add(b16);
            b17.setBounds(10, 260, 80, 50);
            add(b17);
            b18.setBounds(90, 260, 80, 50);
            add(b18);
            setSize(260, 320);
            setTitle("calculator");
            setLayout(null);
            setVisible(true);
        }

    public static void main(String[] arg) {

            AwtCalculator f = new AwtCalculator();
    }
}


