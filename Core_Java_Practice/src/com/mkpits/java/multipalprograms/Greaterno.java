//WAP to campare number  and print their catagory
package com.mkpits.java.multipalprograms;
import java.util.Scanner;
class Greaterno
{
public static void main(String[] args)
{
int num1,num2,num3;
Scanner sc=new Scanner(System.in);
System.out.println("enter 3 number");
num1=sc.nextInt();
num2=sc.nextInt();
num3=sc.nextInt();
if(num1>num2&&num1>num3)
{
System.out.println("num1 is grater");
}
if(num2>num1&&num2>num3)
{
System.out.println("num2 is greater");
}
if(num3>num1&&num3>num2)
{
System.out.println("num3 is greater");
}
}
}