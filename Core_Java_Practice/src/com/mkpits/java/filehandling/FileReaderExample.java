//WAP to  read some string from file using file reader
package com.mkpits.java.filehandling;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("f:\\filewiter.txt");
        int i;
        while((i = fr.read()) != -1) ;
        System.out.println((char) i);
    }
}
