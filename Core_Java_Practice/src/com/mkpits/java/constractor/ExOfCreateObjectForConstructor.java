//Java Program to Create the Object for Class and to Assign Value in the Object Using Constructor
package com.mkpits.java.constractor;

public class ExOfCreateObjectForConstructor {
    int a,b,c;
    ExOfCreateObjectForConstructor()
    {
        a = 5;
        b = 6;
    }
    void change()
    {
        a = 15;
        b = 10;
        c = a + b;
    }
    public static void main(String[] args)
    {
        ExOfCreateObjectForConstructor obj1 = new ExOfCreateObjectForConstructor();
        System.out.println("a:"+obj1.a);
        System.out.println("b:"+obj1.b);
        obj1.change();
        System.out.println("New a:"+obj1.a);
        System.out.println("New b:"+obj1.b);
        System.out.println("c:"+obj1.c);
    }
}


