//A program of ArrayList Using get method return the element at the specific index, whereas the set
// method changes the element
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;

public class ExOfGetAndSetArrayList {
    public static void main(String[] args){
        ArrayList<String> al=new ArrayList<String>();
        al.add("Mango");
        al.add("Pineapple");
        al.add("Apple");
            System.out.println("Returning element:"+al.get(1));
            al.set(1,"Papaya");
            for(String fruit:al)
                System.out.println(fruit);
    }
}



