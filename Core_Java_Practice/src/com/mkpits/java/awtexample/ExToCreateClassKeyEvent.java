//Example of key listener for keyevent
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ExToCreateClassKeyEvent extends Frame implements KeyListener {
    TextField tf;

    public ExToCreateClassKeyEvent() {
        Label l = new Label("enter character");
        l.setBounds(10, 30, 100, 30);
        add(l);
        tf = new TextField(20);
        tf.addKeyListener(this);
        tf.setBounds(120, 30, 100, 30);
        add(tf);
        setSize(500, 300);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        ExToCreateClassKeyEvent k = new ExToCreateClassKeyEvent();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("recently typed character in the textfield are " + e.getKeyChar());

    }

    @Override
    public void keyReleased(KeyEvent e) {


    }

    @Override
    public void keyTyped(KeyEvent e) {

    }
}
