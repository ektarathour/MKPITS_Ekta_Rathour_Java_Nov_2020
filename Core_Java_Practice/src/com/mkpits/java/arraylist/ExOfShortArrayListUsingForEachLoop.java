//A program of sort the array using for each loop
package com.mkpits.java.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class ExOfShortArrayListUsingForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        //list of fruits
        list1.add("Mango");
        list1.add("pineapple");
        list1.add("Papaya");
        list1.add("Banana");
        Collections.sort(list1);
        for (String fruit : list1)
            System.out.println(fruit);


        System.out.println("Sorting numbers...");
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        //list of numbers
        list2.add(3);
        list2.add(2);
        list2.add(4);
        list2.add(1);

        Collections.sort(list2);
        for (Integer number : list2)
            System.out.println(number);
    }
}


