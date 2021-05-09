//program to Accessing the num variable of parent class:
package com.mkpits.java.superkeywordexamples;

public class ExOfAccessingOfNumVariableOfSuperClass {
    int num = 100;
}
class Subclass extends ExOfAccessingOfNumVariableOfSuperClass
{
    int num = 110;
    void printNumber(){
        /* Note that instead of writing num we are
         * writing super.num in the print statement
         * this refers to the num variable of Superclass
         */
        System.out.println(super.num);
    }
    public static void main(String args[]){
        Subclass obj= new Subclass();
        obj.printNumber();
    }

    }


