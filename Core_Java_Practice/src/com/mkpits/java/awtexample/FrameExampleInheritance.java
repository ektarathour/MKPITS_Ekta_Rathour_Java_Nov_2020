//Simple example of AWT by inheritance
package com.mkpits.java.awtexample;

import java.awt.*;

public class FrameExampleInheritance  extends Frame{
    FrameExampleInheritance(){
        Button b = new Button("click me");
        b.setBounds(30, 100, 80, 30);
        add(b);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String args[]) {

        FrameExampleInheritance  f = new FrameExampleInheritance ();
    }
}


