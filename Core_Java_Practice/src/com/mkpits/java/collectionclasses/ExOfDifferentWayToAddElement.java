//A program of ArrayList different way to add element in list
package com.mkpits.java.collectionclasses;
import java.util.ArrayList;

public class ExOfDifferentWayToAddElement {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        System.out.println("Initial list of element:" + al);

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println("After invoking add (E e)method:" + al);
        al.add(1, "Gaurav");
        System.out.println("After invoking add(int index,E element)method:" + al);

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Shikha");
        al2.add("Praveen");
        al.addAll(al2);
        System.out.println("After invoking addAll(Collection<?extends E>c)method:" + al);

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("Mona");
        al3.add("Rahul");
        al.addAll(1, al3);
        System.out.println("int index,Collection<?extends E>c)method:" + al);
    }
}

