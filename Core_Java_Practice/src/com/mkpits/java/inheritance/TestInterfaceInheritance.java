
//example of multipal inheritance by interface
package com.mkpits.java.inheritance;

interface PrintableClass
{
void print();
}
interface Showable
{
void print();
}
class TestInterfaceInheritance implements PrintableClass,Showable
{
public void print()
{
System.out.println("Hello");
}
public static void main(String[] args)
{
  TestInterfaceInheritance obj=new TestInterfaceInheritance();
obj.print();
}
}