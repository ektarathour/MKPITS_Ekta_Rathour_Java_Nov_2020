//WAP to checking character is alphabates or digit or  chraracter  using if else if
package com.mkpits.java.multipalprograms;
import java.util.Scanner;
class Character
{
public static void main(String[] args)
{
char ch;
Scanner sc=new Scanner(System.in);
System.out.println("enter any character");
ch=sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+" is alphabates");
}
else if((ch>='0'&&ch<='9'))
{
System.out.println(ch+" is digit");
}
else
{
System.out.println(ch+" is special symbol");
}
}
}