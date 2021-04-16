//WAP to static method in interface
package com.mkpits.java.interfaceexample;
interface DrawableClass
{
void draw();
static int cube(int x)
{
return x*x*x;
}
}
class  Ractangle implements DrawableClass
{
public void draw()
{
System.out.println("drawing ractangle");
}
}
class TestInterfaceStatic
{
public static void main(String[] args)
{
DrawableClass d=new Ractangle();
d.draw();
System.out.println(DrawableClass.cube(3));
}
}