//WAP to  of  checking primeno or not
package com.mkpits.java.ifandifelsestatement;
import java.util.Scanner;
class Primeno
{
public static void main(String[] args)
  {
  int num;
  int i=2;
  int ans;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter number");
  num=sc.nextInt();
  while(i<num)
    {
    ans=num%i;
    if(ans==0)
       {
       System.out.println("not a prime no");
       }
i++;
    }
if(i==num)
   {
   System.out.println(" prime no");
   }
  }
}
