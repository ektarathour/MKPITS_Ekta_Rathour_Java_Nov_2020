//Program of canvas using awt
package com.mkpits.java.awtexample;

import java.awt.*;

public class ExOfCanvasUsingAwt  {
    public ExOfCanvasUsingAwt()
    {
        Frame f= new Frame("Canvas Example");
        f.add(new MyCanvas());
        f.setLayout(null);
        f.setSize(400, 400);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ExOfCanvasUsingAwt();
    }
}
class MyCanvas extends Canvas
{
    public MyCanvas() {
        setBackground (Color.pink);
        setSize(300, 200);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.red);
        g.fillOval(75, 75, 150, 75);
    }
}
