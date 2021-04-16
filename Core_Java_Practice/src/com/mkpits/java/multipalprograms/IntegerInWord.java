//WAP to  print integer in word from given number
package com.mkpits.java.multipalprograms;
import java.util.Scanner;
class IntegerInWord
{
public static void main(String[] args)
{
Scanner sc= new Scanner(System.in);
System.out.println("enter digit");
int digit=sc.nextInt();
if(digit==1)
{
System.out.println("one");
}
else if(digit==2)
{
System.out.println("two");
}
else if(digit==3)
{
System.out.println("three");
}
else if(digit==4)
{
System.out.println("four");
}
else
{
System.out.println("invalid digit");
}
}
}