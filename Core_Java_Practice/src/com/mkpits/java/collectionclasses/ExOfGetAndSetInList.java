//A program of get and set method of list
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.List;

public class ExOfGetAndSetInList {
    public static void main(String[] args){
        //Creating a list
        List<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Pineapple");
        list.add("Apple");
        list.add("Banana");
        //Accessing element
        System.out.println("Returning element:"+list.get(1));
        //changing the element
        list.set(1,"Papaya");
        for(String fruit:list)
            System.out.println(fruit);
    }
}
