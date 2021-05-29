//A program of hashset from another collection like arraylist
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ExOfHashSetFromAnotherCollection {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Rahul");
        list.add("Sunita");
        list.add("Nita");
        HashSet<String> set = new HashSet(list);
        set.add("Gaurav");
        Iterator<String> i = set.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
