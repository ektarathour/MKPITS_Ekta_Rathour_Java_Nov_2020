//A program of hashtable
package com.mkpits.java.collectionclasses;
import java.util.Hashtable;
import java.util.Map;

public class ExOfHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
        ht.put(100, "Monu");
        ht.put(103, "Sonu");
        ht.put(102, "Gagan");
        ht.put(104, "Shikha");

        for (Map.Entry m : ht.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}


