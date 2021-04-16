// WAP to calculate average
package com.mkpits.java.diffrentcalculation;
import java.util.Scanner;
class Average
{
public static void main(String[] args)
	{
	Scanner in=new Scanner(System.in);
	System.out.println("enter first number");
	int num1=in.nextInt();
	System.out.println("enter second number");
	int num2=in.nextInt();
	System.out.println("enter third number");
	int num3=in.nextInt();
	System.out.println("enter fourth number");
	int num4=in.nextInt();
	System.out.println("average of four numbers:"+(num1+num2+num3+num4)/4);
	}
}
