//Single Inheritance Example

package com.mkpits.java.inheritance;

public class ExOfSingleInheritanceUsingSingleInheritance {
    void eat(){System.out.println("eating...");}
}
class Dog extends ExOfSingleInheritanceUsingSingleInheritance{
    void bark(){System.out.println("barking...");}
}
class TestInheritanceMain{
    public static void main(String args[]){
        Dog d=new Dog();
        d.bark();
        d.eat();
    }}

