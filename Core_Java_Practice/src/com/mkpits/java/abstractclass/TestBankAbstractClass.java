//WAP to abtract class abstract method and non abstract method in java
package com.mkpits.java.abstractclass;

abstract class Bank {
    abstract int getRateOfInterest();
}

class SBI extends Bank {
    int getRateOfInterest() {
        return 7;
    }
}

class PNB extends Bank {
    int getRateOfInterest() {
        return 8;
    }
}

class TestBankAbstractClass {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("Rate of interest =" + b.getRateOfInterest() + "%");
        b = new PNB();
        System.out.println("Rate of interest =" + b.getRateOfInterest() + "%");
    }
}