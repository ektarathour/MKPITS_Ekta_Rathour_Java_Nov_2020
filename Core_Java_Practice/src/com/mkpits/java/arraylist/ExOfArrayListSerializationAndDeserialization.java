//A program of ArrayList serialization and deserialization
package com.mkpits.java.arraylist;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ExOfArrayListSerializationAndDeserialization {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Rani");
        al.add("Vijay");
        al.add("Ajay");
        try {
            FileOutputStream fos = new FileOutputStream("file");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            FileInputStream fis = new FileInputStream("file");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);
        }catch(Exception e)
        {
            System.out.println(e);

        }
    }
}
