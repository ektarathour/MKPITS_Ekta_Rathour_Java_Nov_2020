//A program of Linked hash map
package com.mkpits.java.collectionclasses;

import java.util.LinkedHashMap;
import java.util.Map;

public class ExOfLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<Integer, String> hm= new LinkedHashMap<Integer, String>();
        hm.put(100, "Amit");
        hm.put(101, "Sonu");
        hm.put(102, "Shikha");

        for (Map.Entry m : hm.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}

