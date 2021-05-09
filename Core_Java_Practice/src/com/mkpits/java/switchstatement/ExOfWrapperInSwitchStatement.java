//Java Program to demonstrate the use of Wrapper class
//in switch statement
package com.mkpits.java.switchstatement;

public class ExOfWrapperInSwitchStatement {
    public static void main(String args[])
    {
        Integer age = 18;
        switch (age)
        {
            case (16):
                System.out.println("You are under 18.");
                break;
            case (18):
                System.out.println("You are eligible for vote.");
                break;
            case (65):
                System.out.println("You are senior citizen.");
                break;
            default:
                System.out.println("Please give the valid age.");
                break;
        }
    }
}

