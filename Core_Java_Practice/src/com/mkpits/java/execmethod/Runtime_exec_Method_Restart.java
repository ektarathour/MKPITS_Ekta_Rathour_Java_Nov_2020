

//WAP to example of exec method restart system
package com.mkpits.java.execmethod;
public class Runtime_exec_Method_Restart {
public static void main(String[] args)throws Exception{
Runtime.getRuntime().exec("shutdown -r -t 0");
}
}