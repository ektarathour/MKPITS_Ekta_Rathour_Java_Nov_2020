//A program of Different  way to remove element from hashSet
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.HashSet;

public class ExOfDifferentWayToRemoveElementFromHashSet {
    public static void main(String[] args){
        HashSet<String>hs=new HashSet<>();
        hs.add("Ravi");
        hs.add("Vijay");
        hs.add("Arun");
        hs.add("Sumit");

        System.out.println("An initial list of elements:" + hs);
        hs.remove("Ravi");
        System.out.println("After invoking remove(object)method:" + hs);


        ArrayList<String> hs2 = new ArrayList<String>();
        hs2.add("Ajay");
        hs2.add("Gaurav");
        hs.addAll(hs2);
        System.out.println("Updated list:" + hs);
        hs.removeAll(hs2);
        System.out.println("After invoking removeAll()method:" + hs);
        hs.removeIf(str->str.contains("Vijay"));
        System.out.println("After invoking removeIf()method:" + hs);
        hs.clear();
        System.out.println("After invoking clear()method:" + hs);
    }
}



