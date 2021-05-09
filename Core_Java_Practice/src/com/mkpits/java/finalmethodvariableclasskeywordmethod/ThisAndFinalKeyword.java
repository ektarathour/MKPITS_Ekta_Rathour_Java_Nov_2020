package com.mkpits.java.finalmethodvariableclasskeywordmethod;

//WAP to this keyword and final keyword
 final class Employee
{
final String pancardNumber;
Employee(String pancardNumber)
{
this.pancardNumber=pancardNumber;
}
public String getPancardNumber()
{
return pancardNumber;
}
}
public class ThisAndFinalKeyword
{
public static void main(String[] args)
{
Employee e=new Employee("abc123");
System.out.println("pancard no" +e.getPancardNumber());
}
}
