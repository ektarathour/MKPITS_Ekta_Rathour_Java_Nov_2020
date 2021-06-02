//A program of HashTable putIfAbsent method
package com.mkpits.java.collectionclasses;

import java.util.Hashtable;

public class ExOfHashTablePutIfAbsentMethod {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
        ht.put(100, "Monu");
        ht.put(103, "Sonu");
        ht.put(102, "Gagan");
        ht.put(101, "Shikha");
        System.out.println("Initial Map:"+ht);
        ht.putIfAbsent(104,"Sita");
        System.out.println("Updated Map:"+ht);

    }
}



