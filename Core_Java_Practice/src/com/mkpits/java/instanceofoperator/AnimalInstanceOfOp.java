//WAP to downcasting by instanceof operator
package com.mkpits.java.instanceofoperator;

class AnimalInstanceOfOp {
}

class Dog3 extends AnimalInstanceOfOp {
    static void method(AnimalInstanceOfOp a) {
        if (a instanceof Dog3) {
            Dog3 d = (Dog3) a;
            System.out.println("ok downcasting purformed");
        }
    }

    public static void main(String[] args) {
        AnimalInstanceOfOp a = new Dog3();
        Dog3.method(a);
    }
}