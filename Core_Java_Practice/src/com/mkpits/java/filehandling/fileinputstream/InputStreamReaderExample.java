//Example to input stream reader
package com.mkpits.java.filehandling.fileinputstream;

import java.io.*;

public class InputStreamReaderExample {
    public  static void main(String[] args)  {
        try{
            InputStream stream=new FileInputStream("filewriter.txt");
            Reader reader =new InputStreamReader(stream);
            int data = reader.read();
            while (data != -1) {
                System.out.println((char) data);
                data = reader.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
