//A program of simple linkedList
package com.mkpits.java.collectionclasses;

import java.util.Iterator;
import java.util.LinkedList;

public class SimpleExOfLinkedList {
    public static void main(String[] args) {

        LinkedList<String> al = new LinkedList<String>();
        al.add("Rahul");//adding object in linkedlist
        al.add("Rinki");
        al.add("Piyush");
        al.add("Rani");

        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());

        }
    }
}




