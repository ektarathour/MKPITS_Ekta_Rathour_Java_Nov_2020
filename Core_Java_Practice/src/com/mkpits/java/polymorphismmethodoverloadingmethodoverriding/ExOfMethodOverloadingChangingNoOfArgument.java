// Method Overloading: changing no. of arguments
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfMethodOverloadingChangingNoOfArgument {
    static int add(int a,int b){return a+b;}
    static int add(int a,int b,int c){return a+b+c;}
}
class TestOverloading1{
    public static void main(String[] args){
        System.out.println(ExOfMethodOverloadingChangingNoOfArgument.add(11,11));
        System.out.println(ExOfMethodOverloadingChangingNoOfArgument.add(11,11,11));
    }}

