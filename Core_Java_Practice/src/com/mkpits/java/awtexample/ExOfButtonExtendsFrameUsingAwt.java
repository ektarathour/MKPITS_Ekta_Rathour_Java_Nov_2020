//simple example of AWT where we are inheriting Frame class. Here,
// we are showing Button component of frame
package com.mkpits.java.awtexample;

import java.awt.*;

import static com.sun.glass.ui.Cursor.setVisible;

public class ExOfButtonExtendsFrameUsingAwt extends Frame{
    ExOfButtonExtendsFrameUsingAwt(){
        Button b=new Button("click me");
        b.setBounds(30,100,80,30);// setting button position
        add(b);//adding button into frame
        setSize(300,300);
        setLayout(null);//no layout manager
        setVisible(true);//now frame will be visible, by default not visible
    }
    public static void main(String args[]){
        ExOfButtonExtendsFrameUsingAwt f=new ExOfButtonExtendsFrameUsingAwt();
    }}


