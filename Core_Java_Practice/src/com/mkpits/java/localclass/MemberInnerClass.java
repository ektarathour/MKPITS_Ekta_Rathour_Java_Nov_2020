//Java Member inner class example
package com.mkpits.java.localclass;

public class MemberInnerClass {
    private int data=30;
    class Inner{
        void msg(){System.out.println("data is "+data);}
    }
    public static void main(String args[]){
        MemberInnerClass obj=new MemberInnerClass();
        MemberInnerClass.Inner in=obj.new Inner();
        in.msg();
    }
}
