//In this example, we have created the reference of Operation class in the Circle class

package com.mkpits.java.aggregation;

class Operation {
    int square(int r) {
        return r * r;
    }
}

//creating a class circle
class Circle {
    Operation op;
    double pi = 3.14;

    double area(int r) {
        Operation op = new Operation();
        int sq = op.square(r);
        double ar = pi * sq;
        return ar;
    }
}

class Aggregation {
    public static void main(String[] args) {
        Circle c = new Circle();
        double res = c.area(6);
        System.out.println("square of circle=" + res);
    }
}