//Java Program to Allocate and Initialize Super Class Members Using Constructor
package com.mkpits.java.constractor;

public class ExOfInitializeSuperClassMember {
    ExOfInitializeSuperClassMember(int a, int b)
    {
        System.out.println(" the super class constructor");
        int z = a + b;
        System.out.println("the super class method ");
        System.out.println("the sum is "+z);
    }
}
 class Child extends ExOfInitializeSuperClassMember
{
    Child(int x)
    {
        super(12, 20);
        System.out.println("the sub class constructor ");
        System.out.println(x);
    }
    public static void main(String ... a)
    {
        Child obj = new Child(10);
    }
}

