//A program of ListIterator interface
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ExOfListIteratorInterface {
public static void main(String[] args){
    List<String> al=new ArrayList<String>();
    al.add("Vijay");
    al.add("Ekta");
    al.add("Pooja");
    al.add(1,"Rani");
    ListIterator<String> itr=al.listIterator();
    System.out.println("Traversing element in forward direction");
    while(itr.hasNext()){
        System.out.println("index:"+itr.nextIndex()+"value:"+itr.next());
    }
    System.out.println("Traversing element in backward direction");
    while(itr.hasPrevious()){
        System.out.println("index:"+itr.previousIndex()+"value:"+itr.previous());
    }
    }
}
