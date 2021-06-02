//A program of Remove Element From HashTable
package com.mkpits.java.collectionclasses;

import java.util.Hashtable;

public class ExOfRemoveElementFromHashTable {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
        ht.put(100, "Monu");
        ht.put(103, "Sonu");
        ht.put(102, "Gagan");
        ht.put(104, "Shikha");
        System.out.println("Before remove:"+ht);
        ht.remove(102);
        System.out.println("Before remove:"+ht);
        }
    }
