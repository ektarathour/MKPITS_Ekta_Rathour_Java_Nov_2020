//A program of Linked hash map using key value pair
package com.mkpits.java.collectionclasses;

import java.util.LinkedHashMap;
public class ExOfLinkedHashMapUsingKeyValuePair {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Sonu");
        hm.put(102, "Shikha");
            System.out.println("Keys:" +hm.keySet());
        System.out.println("Values:"+hm.values());
        System.out.println("Key-Value pairs:"+hm.entrySet());
        }
    }

