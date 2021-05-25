//A program of arrayList using while loop using collection of fruits name
package com.mkpits.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ExOfIteratorArrayListUsingWhileLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Papaya");
        list.add("Grapes");
        list.add("Mango");
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}


