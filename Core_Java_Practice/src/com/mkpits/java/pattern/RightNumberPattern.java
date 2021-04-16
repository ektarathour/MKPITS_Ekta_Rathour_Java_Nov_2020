/* Create a simple number program pattern
1
12
123
1234
12345 */

package com.mkpits.java.pattern;
import java.util.Scanner;
public class RightNumberPattern
{
    public static void main(String[] args)
       {
   		Scanner sc=new Scanner(System.in);
   		System.out.println("enter the number of rows");
   	    int rows=sc.nextInt();
           for(int i=1; i<=rows; i++)
   	    {
               for(int j=1; j<=i; j++)
               {
                   System.out.print(j+" ");
               }
               System.out.println();
           }
   	}
   }
   
