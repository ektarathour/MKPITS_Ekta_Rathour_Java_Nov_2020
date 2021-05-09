package com.mkpits.java.superkeywordexamples;

public class ExtoUseofSuperKeywordInMethodOverloading {
    //Overridden method
    void display(){
        System.out.println("Parent class method");
    }
}
class SubclassDemo extends ExtoUseofSuperKeywordInMethodOverloading
{
    //Overriding method
    void display(){
        System.out.println("Child class method");
    }
    void printMsg(){
        //This would call Overriding method
        display();
        //This would call Overridden method
        super.display();
    }
    public static void main(String args[]){
        SubclassDemo obj= new SubclassDemo();
        obj.printMsg();
    }
}

