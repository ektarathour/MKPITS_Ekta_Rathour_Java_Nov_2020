//WAP to Addition two number by user
package com.mkpits.java.diffrentcalculation;
import java.util.Scanner;
class AdditionNumberUser
{
public static void main(String[] args)
	{
	int num1,num2,sum;
	Scanner s=new Scanner(System.in);
	System.out.print("enter  number one:");
	num1=s.nextInt();
	System.out.print("enter  numbers two:");
	num2=s.nextInt();
	sum=num1+num2;
	System.out.println("sum of 2 number=" +sum);
	}
}

