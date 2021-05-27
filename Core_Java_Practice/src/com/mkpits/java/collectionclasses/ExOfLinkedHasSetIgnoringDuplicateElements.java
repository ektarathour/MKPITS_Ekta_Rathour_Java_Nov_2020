//A program of linkedHasSet ignoring duplicates element
package com.mkpits.java.collectionclasses;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class ExOfLinkedHasSetIgnoringDuplicateElements {
    public static void main(String[] args)
    {
        LinkedHashSet<String> set=new LinkedHashSet<String>();
        set.add("one");
        set.add("two");
        set.add("two");
        set.add("four");

        Iterator<String> i= set.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}



