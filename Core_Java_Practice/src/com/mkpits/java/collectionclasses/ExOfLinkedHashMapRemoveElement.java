//A program of Linked hash map  using remove method
package com.mkpits.java.collectionclasses;

import java.util.Hashtable;

public class ExOfLinkedHashMapRemoveElement {
    public static void main(String[] args){
    Hashtable<Integer, String> ht= new Hashtable<Integer, String>();
        ht.put(100, "Monu");
        ht.put(103, "Sonu");
        ht.put(102, "Gagan");

        System.out.println("Before invoking remove() method:"+ht);
        ht.remove(102);
        System.out.println("After invoking remove() method:"+ht);

}
}
