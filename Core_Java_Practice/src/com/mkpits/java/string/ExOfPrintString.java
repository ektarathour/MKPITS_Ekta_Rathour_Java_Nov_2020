//Java Program to Print Simple String entered by user
package com.mkpits.java.string;

import java.util.Scanner;

public class ExOfPrintString {
    public static void main(String args[])
    {
        String str;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Your  Name : ");
        str = scan.nextLine();

        System.out.print("Hello, " + str);
    }
}

