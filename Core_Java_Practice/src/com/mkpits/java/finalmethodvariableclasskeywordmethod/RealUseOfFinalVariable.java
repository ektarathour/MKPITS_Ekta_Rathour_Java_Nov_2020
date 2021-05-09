// program to use of blank final variable
package com.mkpits.java.finalmethodvariableclasskeywordmethod;

public class RealUseOfFinalVariable {
    final int ROLL_NO;

    RealUseOfFinalVariable(int rnum){
        //It must be initialized in constructor
        ROLL_NO=rnum;
    }
    void myMethod(){
        System.out.println("Roll no is:"+ROLL_NO);
    }
    public static void main(String args[]){
        RealUseOfFinalVariable obj=new  RealUseOfFinalVariable(1234);
        obj.myMethod();
    }
}

