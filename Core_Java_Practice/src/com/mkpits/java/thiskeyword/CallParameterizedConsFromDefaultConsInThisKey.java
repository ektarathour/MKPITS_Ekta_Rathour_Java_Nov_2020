//Calling parameterized constructor from default constructor:
package com.mkpits.java.thiskeyword;

public class CallParameterizedConsFromDefaultConsInThisKey {
    CallParameterizedConsFromDefaultConsInThisKey(){
        this(5);
        System.out.println("hello a");
    }
    CallParameterizedConsFromDefaultConsInThisKey(int x){
        System.out.println(x);
    }
}
class TestThis6{
    public static void main(String args[]){
        CallParameterizedConsFromDefaultConsInThisKey a=
                new CallParameterizedConsFromDefaultConsInThisKey();
    }}


