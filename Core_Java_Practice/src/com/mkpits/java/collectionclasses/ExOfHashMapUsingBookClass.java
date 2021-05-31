//A program of  HashMap  Book
package com.mkpits.java.collectionclasses;

import java.util.HashMap;
import java.util.Map;

class BookHashMap {
    int id;
    String name, author, publisher;
    int price;

    public BookHashMap(int id, String name, String author, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}

public class ExOfHashMapUsingBookClass {
    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        //Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 200);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 300);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 400);
        //Adding Books to map
        map.put(1, b1);
        map.put(2, b2);
        map.put(3, b3);

        //Traversing map
        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            int key = entry.getKey();
            Book b = entry.getValue();
            System.out.println(key + " Details:");
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.price);
        }
    }
}