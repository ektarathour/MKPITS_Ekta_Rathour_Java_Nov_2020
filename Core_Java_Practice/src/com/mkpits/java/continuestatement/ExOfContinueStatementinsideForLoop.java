//Java Program to demonstrate the use of continue statement
//inside the for loop.
package com.mkpits.java.continuestatement;

public class ExOfContinueStatementinsideForLoop {
    public static void main(String[] args) {
        //for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //using continue statement
                continue;//it will skip the rest statement
            }
            System.out.println(i);
        }
    }
}

