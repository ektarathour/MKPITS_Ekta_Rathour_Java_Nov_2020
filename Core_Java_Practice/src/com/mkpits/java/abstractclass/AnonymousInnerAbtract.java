//WAP to java anonymous inner class using class
package com.mkpits.java.abstractclass;

abstract class Person {
    abstract void eat();
}

class AnonymousInnerAbtract {
    public static void main(String[] args) {
        Person p = new Person() {
            void eat() {
                System.out.println("nice fruits");
            }
        };
        p.eat();
    }
}
