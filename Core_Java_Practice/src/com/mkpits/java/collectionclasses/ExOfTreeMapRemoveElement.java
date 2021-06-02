//A program of remove element using tree map
package com.mkpits.java.collectionclasses;

import java.util.Map;
import java.util.TreeMap;

public class ExOfTreeMapRemoveElement {
    public static void main(String[] args) {
        TreeMap<Integer, String> tm = new TreeMap<>();
        tm.put(100, "Monu");
        tm.put(103, "Sonu");
        tm.put(102, "Gagan");

        System.out.println("Before invoking remove() method:" + tm);
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
        tm.remove(102);
        System.out.println("After invoking remove() method:" + tm);
        for (Map.Entry m : tm.entrySet()) {
            System.out.println(m.getKey() + "" + m.getValue());
        }
    }
}
