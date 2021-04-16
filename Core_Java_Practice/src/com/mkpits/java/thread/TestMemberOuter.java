//WAP to java member inner class
package com.mkpits.java.thread;

class TestMemberOuter
{
private int data=30;
class Inner
{
void msg()
{
System.out.println("data is " +data);
}
}
public static void main(String[] args)
{
TestMemberOuter obj=new TestMemberOuter();
TestMemberOuter.Inner in=obj.new Inner();
in.msg();
}
}