//A program of hashset  collection of book class
package com.mkpits.java.collectionclasses;

import java.util.HashSet;

class Book3 {
    int id;
    String name, author, publisher;
    int price;

    public Book3(int id, String name, String author, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
public class ExOfHashSetClassBook {
    public static void main(String[] args) {
        HashSet<Book> set = new HashSet<Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 200);
        Book b2 = new Book(102, "Data Communication and networking", "Forouzan", "Mc Graw Hill", 250);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 300);
//adding book to hash table
        set.add(b1);
        set.add(b2);
        set.add(b3);
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.price);
        }
    }
}

