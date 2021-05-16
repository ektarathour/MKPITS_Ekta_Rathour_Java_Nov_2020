//WAP to final method you cannot overrite it
package com.mkpits.java.finalmethodvariableclasskeywordmethod;
class bike
{
void run()
{
System.out.println("running");
}
}
class AnotherFinalMethod extends bike
{
void run()
{
System.out.println("running sefaly with 100kmph");
}
public static void main(String[] args)
{
AnotherFinalMethod h=new AnotherFinalMethod();
h.run();
}
}