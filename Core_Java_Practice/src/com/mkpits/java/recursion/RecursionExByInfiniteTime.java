//Java program for recursion by infinite
package com.mkpits.java.recursion;

public class RecursionExByInfiniteTime {
    static void p(){
        System.out.println("hello");
        p();
    }

    public static void main(String[] args) {
        p();
    }
}

