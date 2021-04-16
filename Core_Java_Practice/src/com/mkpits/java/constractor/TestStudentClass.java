//WAP to class student having field rno and name and getdata showdata method
package com.mkpits.java.constractor;
import java.util.*;
class Student
{
int rno;
String name;
void getdata()
{
Scanner scan=new Scanner(System.in);
System.out.println("enter student rno");
rno=scan.nextInt();
System.out.println("enter student name");
name=scan.next();
}
void showdata()
{
System.out.println("rno of first student" +rno);
System.out.println("name of first student" +name);
}
}
class TestStudentClass
{
public  static void main(String[] args)
{
Student s1=new Student();
s1.getdata();
s1.showdata();
}
}