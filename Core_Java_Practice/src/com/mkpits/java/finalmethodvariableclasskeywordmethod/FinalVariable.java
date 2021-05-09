package com.mkpits.java.finalmethodvariableclasskeywordmethod;

//WAP to final variable
class FinalVariable
{
final int speedlimit;
FinalVariable()
 {
 speedlimit=20;
 }
void run()
 {
 System.out.println(speedlimit);
 }
public static void main(String[] args)
  {
  FinalVariable obj=new FinalVariable();
  obj.run();
}
}
