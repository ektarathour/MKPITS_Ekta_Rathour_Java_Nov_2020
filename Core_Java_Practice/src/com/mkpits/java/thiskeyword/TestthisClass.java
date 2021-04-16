//WAP to calling parameterized contructor from default constructor
package com.mkpits.java.thiskeyword;

class ThisClass
{
int x;

     ;ThisClass() {
this(10);
x=20;
System.out.println("hello x=" +x);//20
}
    ThisClass (int x)
{
System.out.println(x); //10
}
}
class  TestthisClass //creating a class
{


    public static void main(String[] args)
{
    ThisClass  a=new ThisClass() ;

}
}