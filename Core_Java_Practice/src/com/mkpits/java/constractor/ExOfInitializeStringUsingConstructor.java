//Java Program Which has 2 Classes Which Initializes a String in Its Constructor
package com.mkpits.java.constractor;

public class ExOfInitializeStringUsingConstructor {
    String a, b;

    public ExOfInitializeStringUsingConstructor() {
        System.out.println("Base Class Constructor");
        a = "String from Base Class";
    }

    static class StringInitialiseDemo extends ExOfInitializeStringUsingConstructor {
        public StringInitialiseDemo() {
            System.out.println("Derived Class Constructor");
            b = "String from Derived Class";
        }

        public static void main(String... arg) {
            StringInitialiseDemo obj = new StringInitialiseDemo();
            System.out.println("the strings initialised in the constructors of Base and Derived classes are :");
            System.out.println(obj.a + " and " + obj.b);
        }
    }
}

