//WAP to compile time error in final variable
package com.mkpits.java.finalmethodvariableclass;
//
class BikeFinalVariableCompileError
{
int speedlimit=90;
void run()
{
speedlimit=400;
}
public static void main(String[] args)
{
    BikeFinalVariableCompileError obj=new BikeFinalVariableCompileError();
obj.run();
}
}