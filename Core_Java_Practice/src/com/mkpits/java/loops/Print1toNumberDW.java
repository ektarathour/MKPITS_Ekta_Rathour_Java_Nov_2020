//WAP to accept a number and print from 1 to the number entered by the user using do while loop then it should ask to user wheather to accept another number or not
package com.mkpits.java.loops;
import java.util.*;
class Print1toNumberDW
{
public static void main(String[] args)
{
int i=1;
char ch='y';
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of n");
int n=sc.nextInt();
System.out.println("number are");
do
{
System.out.println(i);
i++;
}
while(i<=n);
Scanner s=new Scanner(System.in);
System.out.println("do you to continue");
ch=s.next().charAt(0);
while(ch=='y');
System.out.println("\n bye");
}
}
