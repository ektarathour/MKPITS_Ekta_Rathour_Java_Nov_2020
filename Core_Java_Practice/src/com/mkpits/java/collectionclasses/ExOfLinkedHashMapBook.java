//A program of  collection of book using linked hash map
package com.mkpits.java.collectionclasses;

import java.util.LinkedHashMap;
import java.util.Map;

class BookLinkedHashMap {
    int id;
    String name, author, publisher;
    int price;

    public BookLinkedHashMap(int id, String name, String author, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
public class ExOfLinkedHashMapBook {
    public static void main(String[] args) {
        Map<Integer,Book>lhm = new LinkedHashMap<>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 200);
        Book b2 = new Book(102, "Data Communication and networking", "Forouzan", "Mc Graw Hill", 250);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 300);
//adding book to hash table
        lhm.put(2,b1);
        lhm.put(1,b2);
        lhm.put(3,b3);

        for(Map.Entry<Integer,Book>entry:lhm.entrySet()){
            int key= entry.getKey();
            Book b= entry.getValue();
            System.out.println(key+"Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }

    }
}



