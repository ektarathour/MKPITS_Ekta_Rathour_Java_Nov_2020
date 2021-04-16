//WAP to interface program
package com.mkpits.java.inheritance;


interface PrintableClassAnother
{
void print();
}
	interface ShowableEx
		{
	void show();
		}
public class PrintableExInterface implements PrintableClassAnother,ShowableEx
{
	public void print()
		{
		System.out.println("Hello");
		}
	public void show()
			{
			System.out.println("Welcome");
			}
public static void main(String[] args)
	{
	PrintableExInterface obj=new PrintableExInterface();
	obj.print();
	obj.show();
	}
}