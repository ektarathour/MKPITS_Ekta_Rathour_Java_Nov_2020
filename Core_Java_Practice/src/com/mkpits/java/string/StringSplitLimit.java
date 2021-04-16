//example of split(string regex,int limit) method
package com.mkpits.java.string;
import java.util.*;
class StringSplitLimit
{
public static void main(String[] args)
{
String fname="ekta,pooja,rani";
String[] arr=fname.split(",",2);
for(String s:arr)
System.out.println(s);
}
}