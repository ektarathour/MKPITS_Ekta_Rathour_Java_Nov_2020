//WAP to TestInner class
package com.mkpits.java.localclass;
class Student
{
private int rno=11;
class Address
{
public void showdata()
{
System.out.println("rno is " +rno);
}
}
}
class TestinnerClass
{
public static void main(String[] args)
{
Student obj=new Student();
Student.Address sa =obj.new Address();
sa.showdata();
}
}