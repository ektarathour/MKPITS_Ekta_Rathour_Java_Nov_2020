//WAP to split(String regex) method
package com.mkpits.java.string;
import java.util.*;
class StringSplitMethod
{
public static void main(String[] args)
{
String fname="ekta,rani,pooja";
String[] arr=fname.split(",");
for(String s:arr)
System.out.println(s);
}
}