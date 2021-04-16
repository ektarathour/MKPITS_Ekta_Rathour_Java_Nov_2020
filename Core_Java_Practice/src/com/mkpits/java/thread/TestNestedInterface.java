//WAP to nested interface which is  declare within the interface
package com.mkpits.java.thread;
interface Showable
{
void show();
interface  Message
{
void msg();
}
}
class TestNestedInterface implements Showable.Message
{
public void msg()
{
System.out.println("welcome to nested interface");
}
public static void main(String[] args)
{
Showable.Message sm=new TestNestedInterface();
sm.msg();
}
}