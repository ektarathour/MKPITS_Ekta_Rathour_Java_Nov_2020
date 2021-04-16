//example of print   1 to  from given number by user  using do while loop
package com.mkpits.java.loops;
import java.util.*;
class Print1toUserInteredNoDW
{
public static void main(String[] args)
{
int i=1;
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
}
}