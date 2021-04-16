//example of StringBuffer append() method
package com.mkpits.java.stringbuffer;
class StringBufferExample
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer("Hello");
sb.append("java");//now original string is changed
System.out.println(sb);//print Hello java
}
}