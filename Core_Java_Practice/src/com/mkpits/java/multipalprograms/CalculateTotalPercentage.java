//WAP to calculate total and percentage of number

package com.mkpits.java.multipalprograms;
import java.util.Scanner;
class CalculateTotalPercentage
{
public static void main(String[] args)
{
int num1,num2,num3,rollno,total;
float percentage;
String name;
Scanner sc=new Scanner(System.in);
System.out.println("enter name");
name=sc.next();
System.out.println("enter rollno");
rollno=sc.nextInt();
System.out.println("enter marks of 3 subject ");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
total=num1+num2+num3;
total=total/3;
percentage=(float)(total/500.0f)*100.0f;
System.out.println("name=" +name);
System.out.println("total marks=" +total);
System.out.println("percentage=" +percentage);
}
}