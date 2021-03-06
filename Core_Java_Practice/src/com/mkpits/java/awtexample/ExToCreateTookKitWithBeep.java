//Example of create toolkit with beep
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionListener;
public class ExToCreateTookKitWithBeep {
    public static class ToolkitExample {
        public static void main(String[] args) {
            Frame f = new Frame("ToolkitExample");
            Button b = new Button("beep");
            b.setBounds(50, 100, 60, 30);

            f.add(b);
            f.setSize(300, 300);
            f.setLayout(null);
            f.setVisible(true);
            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    Toolkit.getDefaultToolkit().beep();
                }
            });
        }


    }
}
