//create a program of multilevel inheritance
package com.mkpits.java.inheritance;
import java.util.*;
class Person
{
String name;
void getpersondata(String name)
{
this.name=name;
}
void showpersondata()
{
System.out.println("name=" +name);
}
}
class Employee extends Person
{
float Salary;
void getemployeedata(float salary)
{
this.Salary=salary;
}
void showemployeedata()
{
System.out.println("salary=" +Salary);
}
}
class ParttimeEmployee extends Employee
{
int workinghours;
void getemployeedata(int workinghours)
{
this.workinghours=workinghours;
}
void showparttimeemployeedata()
{
System.out.println("workinghours=" +workinghours);
}

    public void getparttimeemployeedata(int whours) {
    }

    public void showeemployeedata() {
    }
}
class TestInheritance
{
public static <parttimeemployee> void main(String[] args)
{
Scanner sc=new Scanner(System.in);
    System.out.println("enter employee name");
String ename=sc.next();
System.out.println("enter employee salary");
System.out.println("enter employee workinghour");
int whours=sc.nextInt();
    ParttimeEmployee emp = null;
    emp.getpersondata(ename);
    int sal = 0;
    emp.getemployeedata(sal);
emp.getparttimeemployeedata(whours);
emp.showpersondata();
emp.showeemployeedata();
emp.showparttimeemployeedata();
}
}











