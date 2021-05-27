//A program of linkedHasSet class and element iterate in insertion order
package com.mkpits.java.collectionclasses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExOfLinkedHasSetClass {
    public static void main(String[] args)
    {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        set.add("five");
        Iterator<String> i= set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}
