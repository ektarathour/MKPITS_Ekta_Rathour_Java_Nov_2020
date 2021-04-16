/*WAP to print Right Triangle Star Pattern

         *
       * *
     * * *
   * * * *
 * * * * *    */

package com.mkpits.java.pattern;
import java.util.Scanner;
public class RightTriangle
{
    public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows");
	    int rows=sc.nextInt();
        for(int i=1; i<=rows; i++)
	    {
            for(int j=rows-1; j>=i; j--)
            {
                System.out.print(" ");
            }
                  for(int k=1; k<=i; k++)
                 {
                  System.out.print("*");
		         }
		         System.out.println();
        }
	}
}


