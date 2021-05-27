//A program of linked list collection of book class
package com.mkpits.java.collectionclasses;

import java.util.LinkedList;
import java.util.List;

class BookLinkedList{
    int id;
    String name,author,publisher;
    int price;
    public BookLinkedList(int id,String name,String author,String publisher,int price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
    }
}
public class ExOfLinkedListBook {
    public static void main(String[] args){
        List<Book> bl=new LinkedList<Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",200);
        Book b2=new Book(102,"Data Communication and networking","Forouzan","Mc Graw Hill",250);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",300);

        bl.add(b1);
        bl.add(b2);
        bl.add(b3);

        for(Book b:bl){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }

    }
}




