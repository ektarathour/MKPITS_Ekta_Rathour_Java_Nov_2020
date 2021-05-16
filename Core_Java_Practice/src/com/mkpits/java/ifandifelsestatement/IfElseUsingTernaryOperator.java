//Program of use of if else using Ternary Operator
package com.mkpits.java.ifandifelsestatement;

public class IfElseUsingTernaryOperator {
    public static void main(String[] args) {
        int number=13;
        //Using ternary operator
        String output=(number%2==0)?"even number":"odd number";
        System.out.println(output);
    }
}
