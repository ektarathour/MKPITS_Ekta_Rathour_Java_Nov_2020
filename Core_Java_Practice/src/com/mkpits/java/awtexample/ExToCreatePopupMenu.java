//Example of popup menu
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ExToCreatePopupMenu {
    ExToCreatePopupMenu(){
        final Frame f =new Frame("PopupMenu Example");
        final PopupMenu Popupmenu=new PopupMenu("Edit");
        MenuItem cut=new MenuItem("Cut");
        cut.setActionCommand("Cut");
        MenuItem copy=new MenuItem("copy");
        copy.setActionCommand("copy");
        MenuItem paste=new MenuItem("paste");
        paste.setActionCommand("paste");
        Popupmenu.add(cut);
        Popupmenu.add(copy);
        Popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                Popupmenu.show(f , e.getX(), e.getY());
            }
        });

        f.add(Popupmenu);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String args[])
    {
        new ExToCreatePopupMenu();
    }
}


