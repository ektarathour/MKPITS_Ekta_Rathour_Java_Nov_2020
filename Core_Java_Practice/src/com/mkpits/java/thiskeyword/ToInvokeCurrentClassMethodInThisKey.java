//this: to invoke current class method
package com.mkpits.java.thiskeyword;

public class ToInvokeCurrentClassMethodInThisKey {
    void m(){System.out.println("hello m");}
    void n()
    {
        System.out.println("hello n");
        //m();//same as this.m()
        this.m();
    }
}
class TestThis4{
    public static void main(String args[]){
        ToInvokeCurrentClassMethodInThisKey a=new ToInvokeCurrentClassMethodInThisKey();
        a.n();
    }}



