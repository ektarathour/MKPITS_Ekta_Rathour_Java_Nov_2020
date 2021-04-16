
//example of nested interface which is declare within the class
package com.mkpits.java.interfaceexample;

class A
{
interface Message
{
void msg();
}
}
class TestNestedInterfaceInClass implements A.Message
{
public void msg()
{
System.out.println("welcome to nested interface");
}
public static void main(String[] args)
{
A.Message am=new TestNestedInterfaceInClass ();
am.msg();
}
}