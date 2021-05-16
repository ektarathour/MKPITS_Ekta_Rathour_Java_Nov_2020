//A program of protected Members in Inheritance
package com.mkpits.java.inheritance;

public class ExOfProtectedMembersInInheritanc {

        protected String name;

        protected void display() {
            System.out.println("I am an animal.");
        }
    }

    class DogIn extends ExOfProtectedMembersInInheritanc {

        public void getInfo() {
            System.out.println("My name is " + name);
        }
    }

    class Main {
        public static void main(String[] args) {

            // create an object of the subclass
            DogIn labrador = new DogIn();

            // access protected field and method
            // using the object of subclass
            labrador.name = "Rocky";
            labrador.display();

            labrador.getInfo();
        }
    }


