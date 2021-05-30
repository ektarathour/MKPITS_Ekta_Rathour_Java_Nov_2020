//A program of retrieve and remove the highest and lowest value
package com.mkpits.java.collectionclasses;

import java.util.TreeSet;

public class ExOfRetrieveAndRemoveHighestAndLowestValue {
    public static void main(String[] args){
        TreeSet<Integer> ts=new TreeSet<Integer>();
        ts.add(50);
        ts.add(12);
        ts.add(45);
        ts.add(3);
        System.out.println("Highest value:"+ts.pollFirst());
            System.out.println("Lowest value:"+ts.pollLast());
        }
    }

