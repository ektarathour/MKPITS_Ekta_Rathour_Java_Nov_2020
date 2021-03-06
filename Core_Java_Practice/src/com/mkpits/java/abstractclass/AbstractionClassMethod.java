//WAP to abstract class that has abstract method
package com.mkpits.java.abstractclass;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("drawing rectangle");
    }
}

class Circle1 extends Shape {
    void draw() {
        System.out.println("drawing circle");
    }
}

class AbstractionClassMethod {
    public static void main(String[] args) {
        Shape s = new Circle1();
        s.draw();
    }
}
