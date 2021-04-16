//WAP to object and class example : initialization through reference class student having rno name
package com.mkpits.java.multipalprograms;
class Student
{
int rno;
String name;
}
class InitializeObjectThroughReferenceVariable
{
public static void main(String[] args)
{
Student s1=new Student();
Student s2=new Student();
s1.rno=123;
s1.name="ekta";
s2.rno=134;
s2.name="rani";
System.out.println("rno of first student" +s1.rno);
System.out.println("name of first student" +s1.name);
System.out.println("rno of second student" +s2.rno);
System.out.println("name of second student" +s2.name);
}
}

