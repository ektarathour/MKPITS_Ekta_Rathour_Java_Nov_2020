//wap to java fileinputstream - read single character
package com.mkpits.java.filehandling.fileinputstream;

import java.io.FileInputStream;

public class FileInputStreamReadSingleChar {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("G:\\testout.txt");
            int i = fin.read();
            System.out.println((char) i);
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
