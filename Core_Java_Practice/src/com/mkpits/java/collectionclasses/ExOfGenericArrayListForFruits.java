//A program of generic ArrayList for fruits
package com.mkpits.java.collectionclasses;
import java.util.ArrayList;

public class ExOfGenericArrayListForFruits {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Mango");
        list.add("Banana");
        list.add("Papaya");
        list.add("Grapes");
        list.add("Mango");
        System.out.println(list);
    }
}
