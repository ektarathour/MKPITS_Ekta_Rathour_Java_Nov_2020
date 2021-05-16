//A program of polymorphism
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfPolyUsingPolyUsingPolygonClass {


        public void render() {
            System.out.println("Rendering Polygon...");
        }
    }

     class Square extends ExOfPolyUsingPolyUsingPolygonClass {

        public void render() {
            System.out.println("Rendering Square...");
        }
    }

     class Circle extends ExOfPolyUsingPolyUsingPolygonClass {

        public void render() {
            System.out.println("Rendering Circle...");
        }
    }

    class MainMethod {
        public static void main(String[] args) {

            // create an object of Square
            Square s1 = new Square();
            s1.render();

            // create an object of Circle
            Circle c1 = new Circle();
            c1.render();
        }
    }

