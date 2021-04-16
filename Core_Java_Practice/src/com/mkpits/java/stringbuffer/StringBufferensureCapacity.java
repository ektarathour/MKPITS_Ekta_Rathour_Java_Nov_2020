//WAP to StringBuffer ensureCapacity method
package com.mkpits.java.stringbuffer;

class StringBufferensureCapacity
{
public static void main(String[] args)
{
StringBuffer sb=new StringBuffer();
System.out.println(sb.capacity());
sb.append("Hello");
System.out.println(sb.capacity());
sb.append("java is my favorite language");
System.out.println(sb.capacity());
sb.ensureCapacity(10);
System.out.println(sb.capacity());
sb.ensureCapacity(50);
System.out.println(sb.capacity());
}
}
