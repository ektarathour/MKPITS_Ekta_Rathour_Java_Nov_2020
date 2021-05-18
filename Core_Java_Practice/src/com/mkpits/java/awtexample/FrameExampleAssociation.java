//Simple example of AWT by association
package com.mkpits.java.awtexample;

import java.awt.*;

import static com.sun.glass.ui.Cursor.setVisible;

 class FrameExampleAssociation {
        FrameExampleAssociation(){
            Frame f=new Frame();
            Button b = new Button("click me");
            b.setBounds(30, 50, 80, 30);
            f.add(b);
            f.setSize(300,300);
            f.setLayout(null);
            setVisible(true);
        }

        public static void main(String args[]) {

            FrameExampleAssociation f = new FrameExampleAssociation ();
        }
    }



