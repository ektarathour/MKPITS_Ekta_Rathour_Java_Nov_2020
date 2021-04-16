//wap to printing data of two lines testin.txt and testout.txt
package com.mkpits.java.filehandling.fileinputstream;

import java.io.FileInputStream;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {
    public static void main(String[] args)throws Exception{
        FileInputStream input1=new FileInputStream("G:\\testin.txt");
        FileInputStream input2=new FileInputStream("G:\\testout.txt");
        SequenceInputStream inst=new SequenceInputStream(input1, input2);
        int j;

        while((j=inst.read())!=-1){
            System.out.print((char)j);
        }
        inst.close();
        input1.close();
        input2.close();
    }
}

