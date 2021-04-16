//Example of event handling with same class
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.*;

class AEventSameClass extends Frame implements ActionListener {
    TextField tf;

    AEventSameClass() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);
        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);
        b.addActionListener(this);
        add(b);
        add(tf);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {


    }

    public static void main(String[] args) {

        new AEventSameClass();
    }
}
