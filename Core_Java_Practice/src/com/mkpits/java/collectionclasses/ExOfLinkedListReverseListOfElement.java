//A program of linked list reverse a list of element
package com.mkpits.java.collectionclasses;

import java.util.Iterator;
import java.util.LinkedList;

public class ExOfLinkedListReverseListOfElement {
    public static void main(String[] args){
        LinkedList<String> ll=new LinkedList<String>();
        ll.add("Ekta");
        ll.add("Pooja");
        ll.add("Rani");
        Iterator i=ll.descendingIterator();
        while (i.hasNext())
        {
        System.out.println(i.next());
        }
    }
}
