// A program of deque With Book class
package com.mkpits.java.collectionclasses;


import java.util.ArrayDeque;
import java.util.Deque;

class BookDeque {
        int id;
        String name,author,publisher;
        int price;
        public BookDeque(int id, String name, String author, String publisher, int price) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.price = price;
        }
    }
    public class ExOfDequeBook {
    public static void main(String[] args) {
        Deque<Book> set = new ArrayDeque<Book>();
//Creating Books
        Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 800);
        Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 400);
        Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 600);
//Adding Books to Deque
        set.add(b1);
        set.add(b2);
        set.add(b3);
//Traversing ArrayDeque
        for (Book b : set) {
            System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.price);
        }
    }
}