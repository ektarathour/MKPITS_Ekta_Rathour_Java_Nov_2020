//A program of list where we are using arraylist class as the implementation
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.List;

public class ExOfListWhereUsingArrayListClassImplementation {
    public static void main(String[] args){
        List<String> list=new ArrayList<String>();
       //adding element in the list
        list.add("Mango");
        list.add("Banana");
        list.add("Papaya");
        list.add("Grapes");
        list.add("Mango");
        for(String fruits:list)
        System.out.println(fruits);
    }
}


