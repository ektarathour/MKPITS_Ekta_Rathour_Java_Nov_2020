//Another example of java instanceof operator
package com.mkpits.java.instanceofoperatoranddowncasting;

public class AnotherExaOfInstanceOfOperatorAnimalClass {
    static class Dog1 extends AnotherExaOfInstanceOfOperatorAnimalClass{ //Dog inherits Animal

        public static void main(String args[]) {
            Dog1 d = new Dog1();
            System.out.println(d instanceof AnotherExaOfInstanceOfOperatorAnimalClass);//true
        }
    }

}
