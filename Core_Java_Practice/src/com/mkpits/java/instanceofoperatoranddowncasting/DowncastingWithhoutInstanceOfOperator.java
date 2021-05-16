//DowncastingWithhoutInstanceOfOperator
package com.mkpits.java.instanceofoperatoranddowncasting;

public class DowncastingWithhoutInstanceOfOperator {
    static class Dog4 extends DowncastingWithhoutInstanceOfOperator {
        static void method(DowncastingWithhoutInstanceOfOperator a) {
            Dog4 d=(Dog4)a;//downcasting
            System.out.println("ok downcasting performed");
        }
        public static void main (String [] args) {
            DowncastingWithhoutInstanceOfOperator a=new Dog4();
            Dog4.method(a);
        }
    }
}
