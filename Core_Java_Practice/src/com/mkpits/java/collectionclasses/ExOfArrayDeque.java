//A program of simple deque
package com.mkpits.java.collectionclasses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExOfArrayDeque {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("mona");
        deque.add("Akash");
        deque.add("Ajay");
        for (String str : deque) {
            System.out.println(str);
        }
    }
}

