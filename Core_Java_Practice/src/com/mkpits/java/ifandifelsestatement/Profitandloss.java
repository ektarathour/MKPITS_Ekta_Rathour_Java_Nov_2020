//WAP to example of calculate profit,loss and neutral
package com.mkpits.java.ifandifelsestatement;
import java.util.Scanner;
class Profitandloss
{
public static void main(String[] args)
{
int loss,profit;
Scanner s=new Scanner(System.in);
System.out.println("enter the costprice");
int cp=s.nextInt();
System.out.println("enter selling price");
int sp=s.nextInt();
if(cp>sp)
{
loss=cp-sp;
System.out.println("loss:" +loss);
}
else if(cp<sp)
{
profit=sp-cp;
System.out.println("profit:" +profit);
}
else
{
System.out.println("neutral");
}
}
}