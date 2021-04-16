/* create Right Alphabetic triangle

A
A B
A B C
A B C D
A B C D E
A B C D E F  */

package com.mkpits.java.pattern;
import java.util.Scanner;
class  RightAlphabeticTriangle

{
    public static void main(String[] args)
    {
        int alphabet = 65;
                for (int i = 0; i <= 5; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print((char) (alphabet + j) + " ");
            }
            System.out.println();
        }
    }
}
