//A program to polymorphism method overloading using language class
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfPolyUsingMethodOverloadingLanguageClass {

        public void displayInfo() {
            System.out.println("Common English Language");
        }
    }

    class Java extends ExOfPolyUsingMethodOverloadingLanguageClass {
        @Override
        public void displayInfo() {
            System.out.println("Java Programming Language");
        }
    }

    class MainMethod1 {
        public static void main(String[] args) {

            // create an object of Java class
            Java j1 = new Java();
            j1.displayInfo();

            // create an object of Language class
            ExOfPolyUsingMethodOverloadingLanguageClass l1 =
                    new ExOfPolyUsingMethodOverloadingLanguageClass();
            l1.displayInfo();
        }
    }
