//Program of blank final variable
package com.mkpits.java.finalmethodvariableclasskeywordmethod;

public class ExOfBlankFinalVariable {
    final int MAX_VALUE;

    ExOfBlankFinalVariable(){
        //It must be initialized in constructor
        MAX_VALUE=100;
    }
    void myMethod(){
        System.out.println(MAX_VALUE);
    }
    public static void main(String args[]){
        ExOfBlankFinalVariable obj=new  ExOfBlankFinalVariable();
        obj.myMethod();
    }
}