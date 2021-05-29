//A program of sort the list using collections.sort method
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExOfSortList {
    public static void main(String[] args) {
        //creating list of name
        List<String> al1 = new ArrayList<>();
        al1.add("Vijay");
        al1.add("Ekta");
        al1.add("Pooja");
        Collections.sort(al1);
        for (String name : al1)
            System.out.println(name);
        System.out.println("sorting numbers:");
        //creating list of numbers
        List<Integer> al2 = new ArrayList<Integer>();
        al2.add(1);//adding object in linkedlist
        al2.add(54);
        al2.add(5);
        Collections.sort(al2);
        for (Integer number : al2)
            System.out.println(number);
    }
}