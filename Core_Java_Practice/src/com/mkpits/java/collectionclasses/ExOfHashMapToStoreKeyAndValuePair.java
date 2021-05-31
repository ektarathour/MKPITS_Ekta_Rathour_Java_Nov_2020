//A program of HashMap to store key and value pair
package com.mkpits.java.collectionclasses;

import java.util.HashMap;
import java.util.Map;

public class ExOfHashMapToStoreKeyAndValuePair {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "mango");
        map.put(3, "papaya");
        map.put(2, "Grapes");
        map.put(4, "banana");
        System.out.println("Iterating hashmap");
        for (Map.Entry m : map.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
    }
    }
}
