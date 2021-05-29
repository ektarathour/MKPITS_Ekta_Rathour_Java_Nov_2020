//A program of list where we are adding the books
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.List;

class Book4 {
        int id;
        String name, author, publisher;
        int price;

        public Book4(int id, String name, String author, String publisher, int price) {
            this.id = id;
            this.name = name;
            this.author = author;
            this.publisher = publisher;
            this.price = price;
        }
    }
public class ExOfListBook {
        public static void main(String[] args) {
            List<Book> list = new ArrayList<Book>();
            Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 200);
            Book b2 = new Book(102, "Data Communication and networking", "Forouzan", "Mc Graw Hill", 250);
            Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 300);
//adding book to hash table
            list.add(b1);
            list.add(b2);
            list.add(b3);
            for (Book b : list) {
                System.out.println(b.id + " " + b.name + " " + b.author + " " + b.publisher + " " + b.price);
            }
        }
    }
