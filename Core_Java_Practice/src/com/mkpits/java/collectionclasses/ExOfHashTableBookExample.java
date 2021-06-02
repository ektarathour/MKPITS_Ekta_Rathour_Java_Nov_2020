//A program of  key value  Collection of Book using HashTable
package com.mkpits.java.collectionclasses;

import java.util.Hashtable;
import java.util.Map;

class HashTableBook{
    int id;
    String name,author,publisher;
    int price;
public HashTableBook(int id,String name,String author,String publisher,int price){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.price=price;
        }
        }
public class ExOfHashTableBookExample {

    public static void main(String[] args){
        Map<Integer,Book> ht=new Hashtable<Integer,Book>();
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",200);
        Book b2=new Book(102,"Data Communication and networking","Forouzan","Mc Graw Hill",250);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",300);

        ht.put(1,b1);
        ht.put(2,b2);
        ht.put(3,b3);

        for(Map.Entry<Integer,Book>entry:ht.entrySet()){
            int key= entry.getKey();
            Book b= entry.getValue();
            System.out.println(key+"Details:");
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.price);
        }

    }
}



