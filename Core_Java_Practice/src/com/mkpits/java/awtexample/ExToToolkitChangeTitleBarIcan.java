//awt toolkit example change title bar icon
package com.mkpits.java.awtexample;

import java.awt.*;

public class ExToToolkitChangeTitleBarIcan {
    ExToToolkitChangeTitleBarIcan() {
        Frame f = new Frame();
        Image icon = Toolkit.getDefaultToolkit().getImage("f:\\javaprogram\\icon.png");
        f.setIconImage(icon);
        f.setLayout(null);
        f.setSize(400, 400);
    }
    public static void main(String[] args){
        new ExToToolkitChangeTitleBarIcan();

    }

}
