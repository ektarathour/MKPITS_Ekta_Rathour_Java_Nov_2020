//A program of hashSet  where  element iterate in unordered
package com.mkpits.java.collectionclasses;

import java.util.HashSet;
import java.util.Iterator;

public class ExOfHashSetElementIterateInUnordered {
    public static void main(String[] args)
    {
        HashSet<String> set=new HashSet();
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