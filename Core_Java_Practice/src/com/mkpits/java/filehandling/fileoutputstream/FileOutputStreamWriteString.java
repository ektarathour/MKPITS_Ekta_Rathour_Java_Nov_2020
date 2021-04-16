//wap to create a file and write some string into it using fileoutputstream class
package com.mkpits.java.filehandling.fileoutputstream;

import java.io.FileOutputStream;

public class FileOutputStreamWriteString {
    public static void main(String[] args) {
        try {
            FileOutputStream fout = new FileOutputStream("f:\\testout.txt");
            String s="Welcome to mkpits.";
              byte b[]=s.getBytes();
            fout.write(65);
            fout.close();
            System.out.println("success...");
        } catch (Exception e) {System.out.println(e);}
    }
}

