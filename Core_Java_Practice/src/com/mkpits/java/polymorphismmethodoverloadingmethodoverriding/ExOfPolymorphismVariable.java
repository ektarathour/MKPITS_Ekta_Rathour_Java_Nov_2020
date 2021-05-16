//A variable is called polymorphic if it refers  to different values under different
// conditions Here Simple example of polymorphism variable
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfPolymorphismVariable {

    public void display() {
            System.out.println("I am Programming Language.");
        }
    }

    class JavaLanguage extends ExOfPolymorphismVariable {
        @Override
        public void display() {
            System.out.println("I am Object-Oriented Programming Language.");
        }
    }

    class MainMethod4 {
        public static void main(String[] args) {

            // declare an object variable
            ExOfPolymorphismVariable pl;

            // create object of ProgrammingLanguage
            pl = new ExOfPolymorphismVariable();
            pl.display();

            // create object of Java class
            pl = new JavaLanguage();
            pl.display();
        }
    }


