//WAP to  print month name in word using month   number by user enterd
package com.mkpits.java.multipalprograms;
import java.util.Scanner;
class Monthname
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter monthno");
int monthno=sc.nextInt();
if(monthno==1)
{
System.out.println("january");
}
else if(monthno==2)
{
System.out.println("fabruary");
}
else if(monthno==3)
{
System.out.println("march");
}
else if(monthno==4)
{
System.out.println("april");
}
else if(monthno==5)
{
System.out.println("may");
}
else if(monthno==6)
{
System.out.println("june");
}
else if(monthno==7)
{
System.out.println("july");
}
else if(monthno==8)
{
System.out.println("august");
}
else if(monthno==9)
{
System.out.println("september");
}
else if(monthno==10)
{
System.out.println("october");
}
else if(monthno==11)
{
System.out.println("november");
}
else if(monthno==12)
{
System.out.println("december");
}
else
{
System.out.println("invalid month");
}
}
}
