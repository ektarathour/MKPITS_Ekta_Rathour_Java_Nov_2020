//WAP to abstract class that has ab abstract method
package com.mkpits.java.abstractclass;

abstract class BikeEx {
    abstract void run();

    {
    }
}

class AbstractClassAndMethod extends BikeEx {
    void run() {
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        AbstractClassAndMethod obj = new AbstractClassAndMethod();
        obj.run();
    }
}