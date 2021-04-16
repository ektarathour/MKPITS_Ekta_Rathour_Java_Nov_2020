//WAP to dynamic binding example
package com.mkpits.java.binding;

class AnimalDynamicBinding {
    void eat() {
        System.out.println("animal is eating");
    }
}

class Dog extends AnimalDynamicBinding {
    void eat() {
        System.out.println("Dog is eating");
    }

    public static void main(String[] args) {
        AnimalDynamicBinding a = new Dog();
        a.eat();
    }
}