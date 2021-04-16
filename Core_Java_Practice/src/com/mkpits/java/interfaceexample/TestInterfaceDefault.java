
//example of default method in interface
package com.mkpits.java.interfaceexample;

interface DrawableItem
{
void draw();
default void msg()
{
System.out.println("default method");
}
}
class  Ractangleex implements DrawableItem
{
public void draw()
{
System.out.println("drawing ractangle");
}
}
class TestInterfaceDefault
{
public static void main(String[] args)
{
DrawableItem d=new Ractangleex();
d.draw();
d.msg();
}
}