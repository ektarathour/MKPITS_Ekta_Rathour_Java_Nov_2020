//A program of array list where we are adding books to list and printing all the books
package com.mkpits.java.arraylist;

import java.util.ArrayList;
import java.util.List;

class Book{
    int id;
    String name,author,publisher;
    int price;
   public Book(int id,String name,String author,String publisher,int price){
        this.id=id;
        this.name=name;
       this.author=author;
       this.publisher=publisher;
        this.price=price;
    }
}
public class ExOfArrayListBook {
    public static void main(String[] args){
        List<Book> ba=new ArrayList<Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",200);
        Book b2=new Book(102,"Data Communication and networking","Forouzan","Mc Graw Hill",250);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",300);

        ba.add(b1);
        ba.add(b2);
        ba.add(b3);

        for(Book b:ba){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }

    }
}


