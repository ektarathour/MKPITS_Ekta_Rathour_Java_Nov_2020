//wap to create a  file and write some characterfrom A to Z using using fileoutputstream class
package com.mkpits.java.filehandling.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamWriteByte {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("f:\\testout.txt");
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) { System.out.println(e);}

    }
}

