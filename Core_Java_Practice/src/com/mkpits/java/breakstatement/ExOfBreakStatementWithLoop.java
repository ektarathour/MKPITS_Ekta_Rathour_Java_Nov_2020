//Java Program to demonstrate the use of break statement
//inside the for loop.
package com.mkpits.java.breakstatement;

public class ExOfBreakStatementWithLoop {
    public static void main(String[] args) {
        //using for loop
        for(int i=1;i<=10;i++){
            if(i==5){
                //breaking the loop
                break;
            }
            System.out.println(i);
        }
    }
}
