//example of  print dayname in word  using daynumber in integer
package com.mkpits.java.ifandifelsestatement;
import java.util.Scanner;
class DayNameInWordUsingDayNumber
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter dayno");
int dayno=sc.nextInt();
if(dayno==1)
{
System.out.println("monday");
}
else if(dayno==2)
{
System.out.println("tuesday");
}
else if(dayno==3)
{
System.out.println("wednesday");
}
else if(dayno==4)
{
System.out.println("thursday");
}
else if(dayno==5)
{
System.out.println("friday");
}
else if(dayno==6)
{
System.out.println("saturday");
}
else if(dayno==7)
{
System.out.println("sunday");
}
else
{
System.out.println("invalid dayno");
}
}
}