//WAP to this keyword
package com.mkpits.java.thiskeyword;
class book
{
String bookname; //creating instance variable
public book(String bookname) //crating a constructor with parameter
{
this.bookname=bookname;
}
public void disply() //crating a method disply
{
System.out.println("bookname" +bookname);
}
}
class  ThisKeyword //creating a class
{
public static void main(String[] args)
{
book b1=new book("java");
b1.disply();
}
}