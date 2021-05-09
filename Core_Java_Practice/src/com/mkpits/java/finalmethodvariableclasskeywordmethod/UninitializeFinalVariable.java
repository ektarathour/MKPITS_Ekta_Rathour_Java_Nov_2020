package com.mkpits.java.finalmethodvariableclasskeywordmethod;

//WAP to uninitialized static final variable
class UninitializeFinalVariable
{
static final int speedlimit;
static {
 speedlimit=20;
 }
public static void main(String[] args)
  {
  System.out.println(UninitializeFinalVariable.speedlimit);
}
}
