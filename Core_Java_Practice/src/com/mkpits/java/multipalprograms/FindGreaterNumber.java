//WAP to accept three number and disply the greater number number
package com.mkpits.java.multipalprograms;
import java.util.*;
class FindGreaterNumber
{
public static void main(String[]args)
{
int a,b,c;
Scanner sc=new Scanner(System.in);
System.out.println("enter the first number");
a=sc.nextInt();
System.out.println("enter the second number");
b=sc.nextInt();
System.out.println("enter the third number");
c=sc.nextInt();
if(a>b&&a>c)
{
System.out.println("a is greater");
}
else if(b>a&&b>c)
{
System.out.println("b is greater");
}
else
{
System.out.println("c is greater");
}
}
}