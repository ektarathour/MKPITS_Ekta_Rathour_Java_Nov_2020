//Example of event handling with two button with same class
package com.mkpits.java.awtexample;


import java.awt.*;
import java.awt.event.*;

class AEventAnotherExampleSameClass extends Frame implements ActionListener {
    TextField tf;
    Button b1,b2;
    AEventAnotherExampleSameClass() {
        tf = new TextField();
        tf.setBounds(10, 50, 200, 50);
        b1 = new Button("Click me");
        b1.setBounds(50, 150, 100, 50);
        b1.addActionListener(this);
        b2= new Button("Clear");
        b2.setBounds(100,150, 100, 50);
        b2.addActionListener(this);
        add(tf);
        add(b1);
        add(b2);
        setTitle("event example");
        setLayout(null);
        setSize(250, 250);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae) {
if(ae.getSource()==b1){
    tf.setText("ekta");
}
        if (ae.getSource() == b2) {
            tf.setText("");
        }
    }
    public static void main(String[] args){
        AEventAnotherExampleSameClass e=new AEventAnotherExampleSameClass();
    }
}
