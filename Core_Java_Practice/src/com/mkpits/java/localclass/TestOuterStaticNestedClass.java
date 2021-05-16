//example of java static nested class witth static method
package com.mkpits.java.localclass;

class TestOuterStaticNestedClass
{
static int data=30;//instance variable
static class Inner
{
static void msg()
{
System.out.println(data);
}
}
public static void main(String[] args)
{
TestOuterStaticNestedClass.Inner.msg();//no need to create the instance of static nested class
}
}

