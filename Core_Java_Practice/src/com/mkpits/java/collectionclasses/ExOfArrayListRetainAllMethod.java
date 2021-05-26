//A program of ArrayList using retain method
package com.mkpits.java.collectionclasses;
import java.util.ArrayList;
import java.util.Iterator;

public class ExOfArrayListRetainAllMethod {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();

        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");

        ArrayList<String> al2 = new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.retainAll(al2);
        System.out.println("iterating the element after retaining the element of al2");
        Iterator itr=al.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
