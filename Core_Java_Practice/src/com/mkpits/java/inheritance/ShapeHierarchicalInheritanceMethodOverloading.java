//WAP to hierarchical inheritance with method overloading
package com.mkpits.java.inheritance;

class ShapeEx
{
void draw()
{
System .out.println("drawing");
}
}
class circle extends ShapeEx
{
void draw()
{
System .out.println("drawing circle");
}
}
class ractangle extends ShapeEx
{
void draw()
{
System .out.println("drawing ractangle");
}
}
class trangle extends ShapeEx
{
void draw()
{
System .out.println("drawiing trangle");
}
}
class ShapeHierarchicalInheritanceMethodOverloading
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