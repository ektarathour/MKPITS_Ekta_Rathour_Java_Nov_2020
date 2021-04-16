//exanple of StringBuffer and StringBuffer append()
package com.mkpits.java.stringbuffer;
public class ConcatTest
{
public static void main(String[] args)
{
long startTime=System.currentTimeMillis();
StringBuffer sb=new StringBuffer("java");
for(int i=0;i<10000;i++)
{
sb.append("Tpoint");
}
System.out.println("time taken by StringBuffer:" +(System.currentTimeMillis()-startTime)+"ms");
startTime=System.currentTimeMillis();
StringBuffer sb2=new StringBuffer("java");
for(int i=0;i<10000;i++)
{
sb2.append("Tpoint");
}
System.out.println("time taken by StringBuilder:" +(System.currentTimeMillis()-startTime)+"ms");
}
}