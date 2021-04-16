//create a class employee having attributes empno,empname , designation and salary
//and methods getdata and showdata
package com.mkpits.java.constractor;
class EmployeeDetail
{
int empno;
String empname;
String empdesignation;
float empsalary;
void getdata(int a,String b, String c,float d)
{
	empno=a;
	empname=b;
	empdesignation=c;
	empsalary=d;
}
void showdata()
{
System.out.println("empno = " + empno);
System.out.println("empname = " + empname);
System.out.println("designation = " + empdesignation);
System.out.println("salary = " + empsalary);
}
}

//creating a class mkpits
class MkpitsEmployeeClass
{
	public static void main(String[] arg)
	{
		EmployeeDetail emp=new EmployeeDetail();
		emp.getdata(111,"ayushi","manager",50000);
		emp.showdata();

	}
}
