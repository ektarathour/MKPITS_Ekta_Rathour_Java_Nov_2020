//Simple example of instance method
package com.mkpits.java.methodprograms;

public class ExOfInstanceMethod {
    public static void main(String [] args)
    {
//Creating an object of the class
        ExOfInstanceMethod obj = new ExOfInstanceMethod();
//invoking instance method
        System.out.println("The sum is: "+obj.add(12, 13));
    }
    int s;
    //user-defined method because we have not used static keyword
    public int add(int a, int b)
    {
        s = a+b;
//returning the sum
        return s;
    }
}
