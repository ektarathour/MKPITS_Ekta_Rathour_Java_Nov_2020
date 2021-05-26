//A program of ArrayList using empty method
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;

public class ExOfArrayListEmptyMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Is ArrayList Empty:" + al.isEmpty());
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After insertion");
        System.out.println("Is ArrayList Empty:" + al.isEmpty());
    }
}

