//Program to copy string to other string
package com.mkpits.java.string;

import java.util.Scanner;

public class ExOfCopyStringintoAnotherString {

    public static void main(String args[])
    {
        String string1;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a String : ");
        string1 = scan.nextLine();

        System.out.print("Copying String...\n");

        StringBuffer strCopy = new StringBuffer(string1);

        System.out.print("String Copied Successfully..!!\n");
        System.out.print("The Copied String is " + strCopy);
    }
}

