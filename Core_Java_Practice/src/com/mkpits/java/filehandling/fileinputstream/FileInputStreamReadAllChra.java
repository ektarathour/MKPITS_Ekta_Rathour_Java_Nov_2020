//wap to java fileinputstream - read all character
package com.mkpits.java.filehandling.fileinputstream;
import java.io.FileInputStream;

public class FileInputStreamReadAllChra {
    public static void main(String[] args) {
        try {
            FileInputStream fin = new FileInputStream("G:\\testout.txt");
            int i = 0;
            while ((i = fin.read()) != -1) {
                System.out.print((char) i);
            }
            fin.close();
        } catch (Exception e) {
            System.out.println(e);}
        }
    }