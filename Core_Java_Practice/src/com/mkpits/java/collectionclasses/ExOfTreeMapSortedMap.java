//A program of Tree map sorted map method
package com.mkpits.java.collectionclasses;

import java.util.SortedMap;
import java.util.TreeMap;

public class ExOfTreeMapSortedMap {
    public static void main(String[] args) {

    SortedMap<Integer, String> nm = new TreeMap<Integer, String>();
        nm.put(100,"Monu");
        nm.put(101,"Gagan");
        nm.put(102,"Gagan");
        nm.put(103,"Sonu");
        System.out.println("headMap:"+nm.headMap(102));
        System.out.println("tailMap:"+nm.tailMap(102));

        System.out.println("subMap:"+nm.subMap(100,102));
}
}

