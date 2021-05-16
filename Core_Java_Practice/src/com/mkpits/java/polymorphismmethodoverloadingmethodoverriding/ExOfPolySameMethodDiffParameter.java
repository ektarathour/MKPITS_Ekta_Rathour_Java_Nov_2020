//method overloading in Java.Here, the same method will perform different operations
// based on the parameter.
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfPolySameMethodDiffParameter {


            // method without parameter
            public void display() {
                for (int i = 0; i < 10; i++) {
                    System.out.print("*");
                }
            }

            // method with single parameter
            public void display(char symbol) {
                for (int i = 0; i < 10; i++) {
                    System.out.print(symbol);
                }
            }
        }

        class MainMethod2 {
            public static void main(String[] args) {
                ExOfPolySameMethodDiffParameter d1 = new ExOfPolySameMethodDiffParameter();

                // call method without any argument
                d1.display();
                System.out.println("\n");

                // call method with a single argument
                d1.display('#');
            }
        }


