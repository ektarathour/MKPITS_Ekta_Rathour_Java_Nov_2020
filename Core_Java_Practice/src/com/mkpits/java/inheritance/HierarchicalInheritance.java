//WAP to hierarchical inheritance with interface
package com.mkpits.java.inheritance;
interface Printable
{
}
class A implements  Printable
{
public void a()
{
System.out.println("a method");
}

    public void msg() {
    }
}
class B implements Printable
{
public void b()
{
System.out.println("b mthod");
}
}
class call
{
void invoke(Printable p)
{
if(p instanceof A)
{
A a=(A)p;
a.a();
}
if(p instanceof B)
{
B b=(B)p;
b.b();
}
}
}
class HierarchicalInheritance
{
public static void method(String[] args)
{
Printable p=new B();
call c=new call();
c.invoke(p);
}
}