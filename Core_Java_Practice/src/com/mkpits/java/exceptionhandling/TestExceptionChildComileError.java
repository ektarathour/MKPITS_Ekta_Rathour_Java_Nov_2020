//WAP to if super class method does not declare an exception,subclass overridden method cannot declare  the checked exception but can declare checked exception
package com.mkpits.java.exceptionhandling;
import javafx.scene.Parent;
class Parent1
{
void msg()
{
System.out.println("parent");
}
}
class TestExceptionChildCompileError extends Parent
{
void msg()
throws ArithmeticException
{
System.out.println("Child");
}
public static void main(String[] args)
{
 Parent1 p= new Parent1();
p.msg();
}
}