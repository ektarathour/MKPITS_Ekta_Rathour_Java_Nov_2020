//WAP to create Runtime exec method for shutdown
package com.mkpits.java.execmethod;

class Runtimeexec_Method_Shutdown
{
public static void main(String[] args)throws Exception{
Runtime.getRuntime().exec("shutdown -s -t 0");//shutdown
}
}