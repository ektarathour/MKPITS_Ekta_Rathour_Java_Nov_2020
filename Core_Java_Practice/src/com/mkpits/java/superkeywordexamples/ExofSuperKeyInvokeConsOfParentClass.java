//program Use of super keyword to invoke constructor of parent class
package com.mkpits.java.superkeywordexamples;

public class ExofSuperKeyInvokeConsOfParentClass {
    ExofSuperKeyInvokeConsOfParentClass(){
        System.out.println("Constructor of parent class");
    }
}
class SubclassLocal extends ExofSuperKeyInvokeConsOfParentClass
{
    SubclassLocal(){
        /* Compile implicitly adds super() here as the
         *  first statement of this constructor.
         */
        System.out.println("Constructor of child class");
    }
    SubclassLocal(int num){
        /* Even though it is a parameterized constructor.
         * The compiler still adds the no-arg super() here
         */
        System.out.println("arg constructor of child class");
    }
    void display(){
        System.out.println("Hello!");
    }
    public static void main(String args[]){
        /* Creating object using default constructor. This
         * will invoke child class constructor, which will
         * invoke parent class constructor
         */
        SubclassLocal obj= new SubclassLocal();
        //Calling sub class method
        obj.display();
        /* Creating second object using arg constructor
         * it will invoke arg constructor of child class which will
         * invoke no-arg constructor of parent class automatically
         */
        SubclassLocal obj2= new SubclassLocal(10);
        obj2.display();
    }
}



