//example, where downcasting is possible by instanceof operator.
package com.mkpits.java.instanceofoperatoranddowncasting;

public class DowncastingWithInstanceOfOperator {
    static class Dog3 extends DowncastingWithInstanceOfOperator {
        static void method(DowncastingWithInstanceOfOperator a) {
            if(a instanceof Dog3){
                Dog3 d=(Dog3)a;//downcasting
                System.out.println("ok downcasting performed");
            }
        }

        public static void main (String [] args) {
            DowncastingWithInstanceOfOperator a=new Dog3();
            Dog3.method(a);
        }

    }
}
