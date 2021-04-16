//WAP to class  Student having field rno and name and method getdata and showdata without parameter
package com.mkpits.java.string;
import java.util.*;
class StudentClass
{
int rno;
String name;

void getdata()
{
Scanner scan=new Scanner(System.in);
System.out.println("Enter student rno");
rno=scan.nextInt();
System.out.println("Enter student name");
name=scan.next();
}
void showdata()
{
System.out.println("rno of first student=" +rno);
System.out.println("name of first student=" +name);
}
}
class Student_without_Parameter
{
public static void main(String[] args)
{
Student s=new Student();
s.getdata();
s.showdata();
}
}





