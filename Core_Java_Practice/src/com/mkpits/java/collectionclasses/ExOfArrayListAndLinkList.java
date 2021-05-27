//A program of use of arraylist and linkedlist both
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.LinkedList;

public class ExOfArrayListAndLinkList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("Vijay");//adding object in arraylist
        al.add("Ekta");
        al.add("Pooja");
        LinkedList<String> al1 = new LinkedList<String>();
        al1.add("Rahul");//adding object in linkedlist
        al1.add("Rinki");
        al1.add("Piyush");
        System.out.println("arraylist:" + al);
        System.out.println("linkedlist:" + al1);
    }
}


