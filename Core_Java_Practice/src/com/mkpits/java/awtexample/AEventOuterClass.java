// Example of event handling by outer class
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class AEventOuterClass extends Frame {
    TextField tf;

    AEventOuterClass() {
        tf = new TextField();
        tf.setBounds(60, 50, 170, 20);

        Button b = new Button("click me");
        b.setBounds(100, 120, 80, 30);

        Outer ot = new Outer(this);
        b.addActionListener(ot);

        add(b);
        add(tf);

        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {
        new AEventOuterClass();
    }
}



class Outer implements ActionListener {
    AEventOuterClass obj;

    Outer(AEventOuterClass obj) {
        this.obj = obj;
    }

    public void actionPerformed(ActionEvent e) {
        obj.tf.setText("welcome");


    }
}