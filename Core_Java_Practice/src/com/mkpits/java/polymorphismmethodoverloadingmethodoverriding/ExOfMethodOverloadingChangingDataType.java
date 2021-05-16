//Method Overloading: changing data type of arguments
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfMethodOverloadingChangingDataType {
    static int add(int a, int b){return a+b;}
    static double add(double a, double b){return a+b;}
}
class TestOverloading2{
    public static void main(String[] args){
        System.out.println(ExOfMethodOverloadingChangingDataType.add(11,11));
        System.out.println(ExOfMethodOverloadingChangingDataType.add(12.3,12.6));
    }}

