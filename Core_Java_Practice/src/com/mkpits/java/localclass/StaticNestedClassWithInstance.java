//Java static nested class example with instance method
package com.mkpits.java.localclass;

public class StaticNestedClassWithInstance {
    static int data=30;
    static class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        StaticNestedClassWithInstance.Inner obj=new StaticNestedClassWithInstance.Inner();
        obj.msg();
    }
}
