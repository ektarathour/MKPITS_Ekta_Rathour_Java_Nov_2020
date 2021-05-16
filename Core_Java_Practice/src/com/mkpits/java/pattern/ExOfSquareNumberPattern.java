/* SQUARE NUMBER PATTERN PROGRAMS IN JAVA
1 2 3

1 2 3

1 2 3

 */
package com.mkpits.java.pattern;

import java.util.Scanner;

public class ExOfSquareNumberPattern {
    private static Scanner sc;

    public static void main(String[] args)

    {

        int side, i = 0, j;

        sc = new Scanner(System.in);

        System.out.print("enter any side of square");

        side = sc.nextInt();

        while(i < side)

        {


            j = 0;

            while(j < side)

            {

                System.out.print("1");

                j++;

            }

            i++;

            System.out.print("\n");

        }

    }

}

