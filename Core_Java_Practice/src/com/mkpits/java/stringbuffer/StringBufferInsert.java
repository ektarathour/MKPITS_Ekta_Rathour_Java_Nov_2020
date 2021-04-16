//WAP to StringBuffer insert() method
package com.mkpits.java.stringbuffer;

class StringBufferInsert
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer("Hello");
sb.insert(1,"java");//now original string is changed
System.out.println(sb);
}
}