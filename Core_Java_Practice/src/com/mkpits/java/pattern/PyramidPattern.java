/*Wap to print pyramid star Pattern

    *
   * *
  * * *
 * * * *
* * * * *  */
package com.mkpits.java.pattern;
import java.util.*;
public class PyramidPattern
	   {
	       public static void main(String[] args)
	       {
	   		Scanner sc=new Scanner(System.in);
	   		System.out.println("enter the number of rows");
	   	    int rows=sc.nextInt();
	           for(int i=1; i<=rows; i++)
	   	      {
	               for(int j=rows;j>=i; j--)
	               {
	                   System.out.print(" ");
	               }
	                   for(int k=1;k<=i;k++)
	                  {
	                    System.out.print("*");
				      }
	                    for(int l=2;l<=i;l++)
	                   {
	                    System.out.print("*");
					   }
					   System.out.println();
	   	     }
          }
     }
