//A program of ArrayList iteration all way together
package com.mkpits.java.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ExOfIterationAllWayTogether {
    public static void main(String[] args){
        ArrayList<String> list=new ArrayList<String>();
        list.add("Rani");
        list.add("Jaya");
        list.add("Rani");
        list.add("Ekta");
        System.out.println("Traversing list through list iterator");
        ListIterator<String> list1=list.listIterator(list.size());
        while(list1.hasPrevious())
        {
            String str= list1.previous();
            System.out.println(str);}

            System.out.println("Traversing list through for loop");
        for(int i=0;i<list.size();i++) {
            System.out.println(list.get(i));
        }
        System.out.println("Traversing list through for each() method");
        list.forEach(a->{
            System.out.println(a);
        });
        System.out.println("Traversing list through for each remaining()");
                Iterator<String> itr=list.iterator();
        itr.forEachRemaining(a->{
            System.out.println(a);
        });
            }
        }