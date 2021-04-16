//Simple example of AWT by inheritance for three button
package com.mkpits.java.awtexample;

import java.awt.*;

public class FrameExampleInheritanceThreeButton extends Frame {
     FrameExampleInheritanceThreeButton() {
         Button b1 = new Button("1");
         Button b2 = new Button("2");
         Button b3 = new Button("3");
         b1.setBounds(10, 50, 80, 50);
         add(b1);
         b2.setBounds(90, 50, 80, 50);
         add(b2);
         b3.setBounds(170, 50, 80, 50);
         add(b3);
         setSize(260, 300);
         setTitle("calculator");
         setLayout(null);
         setVisible(true);
     }
     public static void main(String[] args){
         FrameExampleInheritanceThreeButton f=new FrameExampleInheritanceThreeButton();
    }

}
