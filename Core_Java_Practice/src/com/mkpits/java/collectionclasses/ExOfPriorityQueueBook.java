//A program of Java PriorityQueue  Book
package com.mkpits.java.collectionclasses;

import java.util.PriorityQueue;
import java.util.Queue;

public class ExOfPriorityQueueBook{

    int id;
    String name,author,publisher;
    int price;
    public ExOfPriorityQueueBook(int id, String name, String author, String publisher, int price) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
    }
    public int compareTo(Book b) {
        if(id>b.id){
            return 1;
        }else if(id<b.id){
            return -1;
        }else{
            return 0;
        }
    }
}
 class priorityQueue {
    public static void main(String[] args) {
        Queue<Book> queue=new PriorityQueue<Book>();
        //Creating Books
        Book b1=new Book(121,"Let us C","Yashwant Kanetkar","BPB",80);
        Book b2=new Book(233,"Operating System","Galvin","Wiley",200);
        Book b3=new Book(101,"Data Communications & Networking","Forouzan","Mc Graw Hill",400);
        //Adding Books to the queue
        queue.add(b1);
        queue.add(b2);
        queue.add(b3);
        System.out.println("Traversing the queue elements:");
        //Traversing queue elements
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }
        queue.remove();
        System.out.println("After removing one book record:");
        for(Book b:queue){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }
    }
}

