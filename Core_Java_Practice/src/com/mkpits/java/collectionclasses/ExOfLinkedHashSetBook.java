//A program of linked list  list collection of book class
package com.mkpits.java.collectionclasses;

import java.util.LinkedHashSet;

class Book1 {
    int id;
    String name, author, publisher;
    int price;

    public Book1(int id, String name, String author, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
}
public class ExOfLinkedHashSetBook {
    public static void main(String[] args) {
        LinkedHashSet<Book> hs = new LinkedHashSet<Book>();
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 200);
        Book b2 = new Book(102, "Data Communication and networking", "Forouzan", "Mc Graw Hill", 250);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 300);
//adding book to hash table
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        for (Book b : hs) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.price);
        }
    }
}