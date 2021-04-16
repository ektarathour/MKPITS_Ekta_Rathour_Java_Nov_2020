//WAP to create for  program interface
package com.mkpits.java.interfaceexample;
interface PrintableClass
{
	void print();
}
class  PrintableEx implements PrintableClass
{
		public  void print()
		{
		System.out.println("hello");
			}
		public static void main(String[] args)
			{
 PrintableEx obj=new PrintableEx();
obj.print();
		}
}