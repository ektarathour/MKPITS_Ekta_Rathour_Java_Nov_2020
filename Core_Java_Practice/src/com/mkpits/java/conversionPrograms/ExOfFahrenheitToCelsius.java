//Program to conversion of fahrenheit  to celsius
package com.mkpits.java.conversionPrograms;

import java.util.Scanner;

public class ExOfFahrenheitToCelsius {
    public static void main(String[] args){
        double a,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter fahrenheit Temperature");
        a=sc.nextDouble();
        System.out.println("Celsius Temperature is="+celsius(a));

    }
    static double celsius(double f)
    {
        return (f-32)*5/9;
    }
}
