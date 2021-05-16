//Example of default constructor
package com.mkpits.java.constractor;

public class ExOfCallingDefaultConstructor {
    int i;
    ExOfCallingDefaultConstructor t;
    boolean b;
    byte bt;
    float ft;
}

class Main {
    public static void main(String args[]) {
        ExOfCallingDefaultConstructor t = new ExOfCallingDefaultConstructor(); 
        
        System.out.println(t.i);
        System.out.println(t.t);
        System.out.println(t.b);
        System.out.println(t.bt);
        System.out.println(t.ft);
    }
}
