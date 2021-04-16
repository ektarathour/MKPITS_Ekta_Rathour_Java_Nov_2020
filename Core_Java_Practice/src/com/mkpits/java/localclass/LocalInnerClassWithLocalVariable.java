
//WAP to localinner class with local variable
package com.mkpits.java.localclass;

public class LocalInnerClassWithLocalVariable
{
private int data=30;//instance variable
void display()
{
int value=50;//local variable
class Local
{
void msg()
{
System.out.println(data);
}
}
Local l=new Local();
l.msg();
}
public static void main(String[] args)
{
LocalInnerClassWithLocalVariable obj=new LocalInnerClassWithLocalVariable();
obj.display();
}
}
