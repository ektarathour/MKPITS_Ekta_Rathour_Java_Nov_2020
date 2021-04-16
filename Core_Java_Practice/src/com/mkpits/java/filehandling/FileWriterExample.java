//WAP to write some string into a file using filerwriter
package com.mkpits.java.filehandling;

import java.io.FileWriter;

public class FileWriterExample {
    public static void main(String[] args){
        try {
            FileWriter fw = new FileWriter("f:\\filewiter.txt");
            fw.write("welcome to mkpits.");
            fw.close();
        }catch(Exception e){System.out.println(e);}
        System.out.println("Success..");

        }
    }

