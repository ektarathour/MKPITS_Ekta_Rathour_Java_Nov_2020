//WAP to java anonymous inner class using interface
package com.mkpits.java.abstractclass;

interface Eatable {
    void eat();
}

class AnonymousInnerInterface {
    public static void main(String[] args) {
        Eatable e = new Eatable() {
            public void eat() {
                System.out.println("eating fruits");
            }
        };
        e.eat();
    }
}