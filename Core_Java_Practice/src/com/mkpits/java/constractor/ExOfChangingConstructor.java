//Java Program to Illustrate Use of Chaining Constructor
package com.mkpits.java.constractor;

public class ExOfChangingConstructor {
    public ExOfChangingConstructor() {
        System.out.println("In default constructor");
    }
    public ExOfChangingConstructor(int i)
    {
        this();
        System.out.println("In single parameter constructor");
    }
    public ExOfChangingConstructor(int i,int j)
    {
        this(j);
        System.out.println("In double parameter constructor");
    }
    public static void main(String a[])
    {
        ExOfChangingConstructor obj = new ExOfChangingConstructor(11,12);
    }
}

