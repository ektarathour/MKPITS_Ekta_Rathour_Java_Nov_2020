//WAP to if super class method does not declare an exception,subclass overridden method cannot declare  the checked exception but can declare unchecked exception
package com.mkpits.java.exceptionhandling;
import javafx.scene.Parent;
class Parent2
{
void msg()
{
System.out.println("parent");
}
}
class TestExceptionChild extends Parent
{
void msg()
throws ArithmeticException
{
System.out.println("Child");
}
public static void main(String[] args)
{
TestExceptionChild p=new TestExceptionChild();
p.msg();
}
}