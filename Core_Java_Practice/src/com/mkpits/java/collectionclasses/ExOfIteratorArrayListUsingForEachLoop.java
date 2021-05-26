//A program of arrayList using for each loop using collection of fruits name
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;

public class ExOfIteratorArrayListUsingForEachLoop {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Pineapple");
        list.add("Apple");
        for(String fruit:list)
            System.out.println(fruit);
    }
}
