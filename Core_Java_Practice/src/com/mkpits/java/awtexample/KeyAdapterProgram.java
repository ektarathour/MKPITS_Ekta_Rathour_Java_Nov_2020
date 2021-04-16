//Example of keyadapter
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;


import static com.sun.glass.ui.Cursor.setVisible;

public class KeyAdapterProgram {
    TextField tf;
    public KeyAdapterProgram()

    {
        Label l=new Label("enter characters");
        l.setBounds(10,30,100,30);
        add(l);
        tf=new TextField(20);
        tf.setBounds(120,30,100,30);
        tf. addKeyListener(new mykeyadapter(this) );
        add(l);


        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }

    private void setLayout(Object o) {
    }

    private void setSize(int i, int i1) {
    }

    private void add(Label l) {
    }

    public static void main(String[] arg)
    {
        KeyAdapterProgram ad=new KeyAdapterProgram();
    }
}
class mykeyadapter extends KeyAdapter
{
    KeyAdapterProgram adapterdemo;
    public mykeyadapter(KeyAdapterProgram adapterdemo)
    {
        this.adapterdemo=adapterdemo;
    }
    public void keyTyped(KeyEvent e)
    {
        System.out.println(" clicked");
    }
}

