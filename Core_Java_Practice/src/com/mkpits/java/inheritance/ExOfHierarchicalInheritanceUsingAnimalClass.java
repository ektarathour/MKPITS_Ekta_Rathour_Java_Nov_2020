//A Program of hierarchical inheritance using animal class
package com.mkpits.java.inheritance;

public class ExOfHierarchicalInheritanceUsingAnimalClass {
    void eat(){System.out.println("eating...");}
}
class Dog2 extends ExOfHierarchicalInheritanceUsingAnimalClass{
    void bark(){System.out.println("barking...");}
}
class Cat extends ExOfHierarchicalInheritanceUsingAnimalClass{
    void meow(){System.out.println("meowing...");}
}
class TestInheritance3{
    public static void main(String args[]){
        Cat c=new Cat();
        c.meow();
        c.eat();
//c.bark();//C.T.Error
    }}

