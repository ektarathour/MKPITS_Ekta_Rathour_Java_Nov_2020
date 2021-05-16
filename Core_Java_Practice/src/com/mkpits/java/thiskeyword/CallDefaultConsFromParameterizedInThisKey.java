//Calling default constructor from parameterized constructor:
package com.mkpits.java.thiskeyword;

public class CallDefaultConsFromParameterizedInThisKey {
    CallDefaultConsFromParameterizedInThisKey(){System.out.println("hello a");}
    CallDefaultConsFromParameterizedInThisKey(int x){
        this();
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){
        CallDefaultConsFromParameterizedInThisKey a=new
                CallDefaultConsFromParameterizedInThisKey(10);
    }}


