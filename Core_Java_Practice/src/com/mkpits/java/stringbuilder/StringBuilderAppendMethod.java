//WAP to StringBuider append() method
package com.mkpits.java.stringbuilder;

class StringBuilderAppendMethod
{
public static void main(String[] args)
{
StringBuilder sb=new StringBuilder("Hello");
sb.append("java");//now original string is changed
System.out.println(sb);//print Hello java
}
}