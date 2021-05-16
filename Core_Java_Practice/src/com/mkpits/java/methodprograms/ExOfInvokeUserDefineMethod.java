//example of the invoke of user define method
package com.mkpits.java.methodprograms;

import java.util.Scanner;

import static com.mkpits.java.methodprograms.ExOfUserDefineMethod.findEvenOdd;

public class ExOfInvokeUserDefineMethod {
    public static void main (String args[])
    {
//creating Scanner class object
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number: ");
//reading value from the user
        int num=scan.nextInt();
//method calling
        findEvenOdd(num);
    }
}
