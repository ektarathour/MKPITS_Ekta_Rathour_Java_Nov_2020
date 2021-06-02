//A program of Hash Table Using getorDefault method
package com.mkpits.java.collectionclasses;

import java.util.Hashtable;

public class ExOfHashTableUseOfGetOrDefaultMethod {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
        ht.put(100, "Monu");
        ht.put(103, "Sonu");
        ht.put(102, "Gagan");
        ht.put(101, "Shikha");
            System.out.println(ht.getOrDefault(101,"Not Found"));
        System.out.println(ht.getOrDefault(104,"Not Found"));
        }
    }

