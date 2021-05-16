//A program of polymorphism with animal class using animalSound method
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfPolyWithAnimalClass {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends ExOfPolyWithAnimalClass {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class Dog extends ExOfPolyWithAnimalClass {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

