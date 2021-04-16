//WAP to anoather example of hierarchical with method overloading
package com.mkpits.java.inheritance;

class Shape
{
void draw()
{
System .out.println("drawing");
}
}
class Circle extends Shape
{
void draw()
{
System .out.println("drawing circle");
}
}
class Ractangle extends Shape
{
void draw()
{
System .out.println("drawing ractangle");
}
}
class Trangle extends Shape
{
void draw()
{
System .out.println("drawiing trangle");
}
}
class Shape_Hierarchical_Inheritance
{
public static void main(String[] args)
{
Circle c=new Circle();
c.draw();
Ractangle r=new Ractangle();
r.draw();
Trangle t=new Trangle();
t.draw();
}
}