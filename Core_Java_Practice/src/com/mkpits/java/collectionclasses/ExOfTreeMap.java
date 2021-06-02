//A program of simple tree map
package com.mkpits.java.collectionclasses;

import java.util.Map;
import java.util.TreeMap;

public class ExOfTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm= new TreeMap<Integer, String>();
        tm.put(100, "Amit");
        tm.put(101, "Sonu");
        tm.put(102, "Shikha");

        for (Map.Entry m : tm.entrySet()){
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}

