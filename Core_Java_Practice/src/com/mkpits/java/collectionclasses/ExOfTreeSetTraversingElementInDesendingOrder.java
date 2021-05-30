//A program of TreeSet traversing element in descending order
package com.mkpits.java.collectionclasses;

import java.util.Iterator;
import java.util.TreeSet;

public class ExOfTreeSetTraversingElementInDesendingOrder {
    public static void main(String[] args){
        TreeSet<String> al=new TreeSet<String>();
        al.add("Payal");
        al.add("Shital");
        al.add("Ajay");
System.out.println("Traversing element through iterator in descending order");
        Iterator<String> itr=al.descendingIterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

