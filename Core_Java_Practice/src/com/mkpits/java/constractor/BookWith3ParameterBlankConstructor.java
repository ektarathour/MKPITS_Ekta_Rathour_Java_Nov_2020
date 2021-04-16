// WAP to  class  book having field  bookname, bookprice and  author blank constructor

package com.mkpits.java.constractor;

import java.util.*;

class Book {

      String bookname;
      String bookauthor;
      float bookprice;

    public Book()
    {
        bookname = "java";
        bookauthor = "ekta";
        bookprice = 200.52f;

    }
    public void show()
    {
        System.out.println("bookname of book=" + bookname);
        System.out.println("bookauthor of book=" + bookauthor);
        System.out.println("bookprice of book=" + bookprice);
    }
}

class BookWith3ParameterBlankConstructor {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        Book b = new Book();//automatic called constructor
        b.show();


    }
}





