
//WAP to calculate total percentage and disply grade using if else if
package com.mkpits.java.diffrentcalculation;

class calculate
{
public static void main(String[] args)
{
int m1=30,m2=80,m3=60;
int total=m1+m2+m3;
float per=(float)(total/300.0f)*100.0f;
System.out.println("total:" +total);
System.out.println("percentage:");
if(per>=75)
{
System.out.println("grade:distinction");
}
else if(per>=60&& per<75)
{
System.out.println("grade:first");
}
else if(per>=40&& per<60)
{
System.out.println("grade:second");
}
else
{
System.out.println("grade:fail");
}
}
}
