//Example of Create Scrollbar Program Vertical in center
package com.mkpits.java.awtexample;

import java.awt.*;

public class ExToCreateScrollbarProgram {
    ExToCreateScrollbarProgram(){
        Frame f= new Frame("Scrollbar Example");
        Scrollbar s=new Scrollbar();
        s.setBounds(100,100, 50,100);
        f.add(s);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[]){
        new ExToCreateScrollbarProgram();
    }
}

