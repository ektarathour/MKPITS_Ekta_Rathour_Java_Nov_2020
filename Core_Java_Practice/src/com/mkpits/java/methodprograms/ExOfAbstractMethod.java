//Example of abstract method
package com.mkpits.java.methodprograms;

 abstract class ExOfAbstractMethod {
    abstract void display();
}
class MyClass extends ExOfAbstractMethod {
    //method impelmentation
    void display() {
        System.out.println("Abstract method?");
    }

       public static void main(String args[]) {
//creating object of abstract class
        ExOfAbstractMethod obj = new MyClass();
//invoking abstract method
        obj.display();
    }
}
