//Another example of two button
package com.mkpits.java.awtexample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnotherExampleTwoButton extends Frame {
    TextField tf;
    AnotherExampleTwoButton(){
            tf=new TextField();
            tf.setBounds(60,50,170,20);
            Button b=new Button("click me");
            b.setBounds(100,120,80,30);

            b.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    tf.setText("Welcome");
                     }
            });
            Button b1=new Button ("Clear");
        b1.setBounds(100,160,80,30);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("");
            }
        });


            add(b);add(tf);add(b1);
            setSize(300,300);
            setLayout(null);
            setVisible(true);
        }
        public static void main(String args[]){
            new AnotherExampleTwoButton();
        }
    }

