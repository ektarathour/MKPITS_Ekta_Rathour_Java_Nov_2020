//WAP to write a common data to 4 files a.txt,b.txt,c.txt and d.txt
package com.mkpits.java.filehandling.fileoutputstream;

import java.io.FileWriter;

public class CharArrayWriter {
    public static void main(String[] args) throws Exception {
        CharArrayWriter caw = new CharArrayWriter();
        caw.write("welcome to mkpits.");
        FileWriter f1 = new FileWriter("F:\\a.txt");
        FileWriter f2 = new FileWriter("F:\\b.txt");
        FileWriter f3 = new FileWriter("F:\\c.txt");
        FileWriter f4 = new FileWriter("F:\\d.txt");
        caw.writeTo(f1);
        caw.writeTo(f2);
        caw.writeTo(f3);
        caw.writeTo(f4);
        f1.close();
        f2.close();
        f3.close();
        f4.close();
        System.out.println("Success...");

    }

    private void writeTo(FileWriter f1) {
    }

    private void write(String s) {
    }
}


