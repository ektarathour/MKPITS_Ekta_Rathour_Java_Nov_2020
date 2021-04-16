//wap to example to read data of file using BufferedOutputStream:
 package com.mkpits.java.filehandling.fileoutputstream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class BufferedOutputStreamExample {

    public static void main(String args[]) throws Exception {

        FileOutputStream fout = new FileOutputStream("E:\\testout.txt");

        BufferedOutputStream bout = new BufferedOutputStream(fout);
        String s = "Welcome to mkpits.";
        byte b[] = s.getBytes();
        bout.write(b);
        bout.flush();
        bout.close();
        fout.close();
        System.out.println("success");
    }
}



