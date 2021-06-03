//A program of tree map navigable map method
package com.mkpits.java.collectionclasses;

import java.util.NavigableMap;
import java.util.TreeMap;

public class ExOfTreeMapNavigableMap {
    public static void main(String[] args) {
        NavigableMap<Integer, String> nm = new TreeMap<Integer,String>();
        nm.put(100, "Monu");
        nm.put(101, "Gagan");
        nm.put(102, "Gagan");
        nm.put(103, "Sonu");
        nm.put(104, "Gagan");

        System.out.println("descendingMap:" +nm.descendingMap());
        System.out.println("headMap:" + nm.headMap(102,true));
        System.out.println("tailMap:" + nm.tailMap(102,true));

        System.out.println("subMap:" + nm.subMap(100,false,102,true));
        }
    }
