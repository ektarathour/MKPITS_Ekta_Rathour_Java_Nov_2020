//WAP to string class method int length()
package com.mkpits.java.string;

class OperationStringLenght
{
public static void main(String[] args)
{
String s3=new String("example");//creating java string by new keyword
int c=s3.length();
for(int i=0;i<c;i++)
{
System.out.println(s3.charAt(i));
}
}
}