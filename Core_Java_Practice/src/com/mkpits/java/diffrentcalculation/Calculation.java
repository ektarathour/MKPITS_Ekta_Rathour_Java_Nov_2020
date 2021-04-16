//wap to accept  2 no and operator like +,-,* from the user then  display the result using switch
package com.mkpits.java.diffrentcalculation;
import java.util.Scanner;
class Calculation
{
public static void main(String[] args)
{
int num1,num2,res=0;
char ch;
Scanner s1=new Scanner(System.in);
System.out.println("enter num1");
num1=s1.nextInt();
System.out.println("enter num2");
num2=s1.nextInt();
System.out.println("enter operator");
ch=s1.next().charAt(0);
switch(ch)
{
case '+':
res=num1+num2;
break;
case '-':
res=num1-num2;
break;
case '*':
res=num1*num2;
break;
default:
System.out.println("invalid operator");
break;
}
System.out.println("result" +res);
}
}