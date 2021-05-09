//Program to covert hexadecimal to octal number
package com.mkpits.java.conversionPrograms;
import java.util.Locale;
import java.util.Scanner;

public class ExOfHexaToOctal {
    public static void main(String arg[])
   {
        String hexdec;
        String hex="0123456789ABCDEF";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hexadecimal Number : ");
        hexdec = sc.nextLine();
        hexdec=hexdec.toUpperCase();
        int decimal=0;
        for(int i=0;i<hexdec.length();i++)
        {
        char ch=hexdec.charAt(i);
        int in=hex.indexOf(ch);
            decimal =16*decimal+in;

            System.out.println("decimal number is :"+decimal);
        System.out.println("octal number is :");
        i=0;
int a[]=new int[50];

        while(decimal != 0)
        {
a[i++]=decimal%8;
decimal=decimal/8;
}
for(int c=i-1;c>0;c--)
{
    System.out.println(a[c]);
}
}
}
}