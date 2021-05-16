//A Program to polymorphism creating object and call method
package com.mkpits.java.polymorphismmethodoverloadingmethodoverriding;

public class ExOfPolymorphismCreatingObjectAndCallMethod {
    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class PigLocal extends ExOfPolymorphismCreatingObjectAndCallMethod {
    public void animalSound() {
        System.out.println("The pig says: wee wee");
    }
}

class DogLocal extends ExOfPolymorphismCreatingObjectAndCallMethod {
    public void animalSound() {
        System.out.println("The dog says: bow wow");
    }
}

class Main {
    public static void main(String[] args) {
        ExOfPolymorphismCreatingObjectAndCallMethod myAnimal =
                new ExOfPolymorphismCreatingObjectAndCallMethod();  // Create a Animal object
        ExOfPolymorphismCreatingObjectAndCallMethod myPig = new PigLocal();  // Create a Pig object
        ExOfPolymorphismCreatingObjectAndCallMethod myDog = new DogLocal();  // Create a Dog object
        myAnimal.animalSound();
        myPig.animalSound();
        myDog.animalSound();
    }
}
