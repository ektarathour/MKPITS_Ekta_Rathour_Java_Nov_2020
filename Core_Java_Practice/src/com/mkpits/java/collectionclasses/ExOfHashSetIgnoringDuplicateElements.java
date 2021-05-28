//A program of HasSet ignoring duplicates element
package com.mkpits.java.collectionclasses;

import java.util.HashSet;
import java.util.Iterator;

public class ExOfHashSetIgnoringDuplicateElements {
    public static void main(String[] atgs){
        HashSet<String>hs=new HashSet<String>();
        hs.add("Vishal");
        hs.add("Priyal");
        hs.add("Amita");
        hs.add("Vishal");
        Iterator itr= hs.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
