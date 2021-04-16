//WAP to class  employee having filed id and name
package com.mkpits.java.constractor;
class EmployeeClass
{
int empid;
String empname;
}
class TestEmployeeClass
{
public  static void main(String[] args)
{
Employee e1=new Employee();
Employee e2=new Employee();
e1.empid=101;
e1.empname="ekta";
e2.empid=102;
e2.empname="pooja";
System.out.println("empid of first employee" +e1.empid);
System.out.println("empname of first employee" +e1.empname);
System.out.println("empid of second employee" +e2.empid);
System.out.println("empname of second employee" +e2.empname);
}
}