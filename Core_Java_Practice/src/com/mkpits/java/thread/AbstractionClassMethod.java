//WAP to abstract class that has abstract method
package com.mkpits.java.thread;
abstract class Shape
 {
 abstract void draw();
 }
class Ractangle extends Shape
{
void draw()
{
System.out.println("drawing ractangle");
}
}
class Circle1 extends Shape
{
void draw()
{
System.out.println("drawing circle");
}
}
class AbstractionClassMethod
{
public static void main(String[] args)
{
Shape s=new Circle1();
s.draw();
}
}
