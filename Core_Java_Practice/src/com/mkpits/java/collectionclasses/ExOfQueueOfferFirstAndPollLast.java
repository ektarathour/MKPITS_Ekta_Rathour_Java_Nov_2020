//A program of offerFirst() and pollLast() method
package com.mkpits.java.collectionclasses;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExOfQueueOfferFirstAndPollLast {
    public static void main(String[] args) {
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("mona");
        deque.add("Akash");
        deque.add("Ajay");
        deque.offerFirst("Jai");
        System.out.println("After offerFirst traversal....");
        for (String str : deque) {
            System.out.println(str);
        }
        deque.pollLast();
        System.out.println("After pollLast() traversal....");
        for (String str : deque) {
            System.out.println(str);
        }
        }
    }

