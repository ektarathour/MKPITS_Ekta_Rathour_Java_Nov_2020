//Java Program to demonstrate having the main method in
//another class
//Creating Student class.
package com.mkpits.java.objectandclass;

public class ExOfDefineMainMethodInAnotherClass {
    int id;
    String name;
}
//Creating another class TestStudent1 which contains the main method
class TestStudent1{
    public static void main(String args[]){
        ExOfDefineMainMethodInAnotherClass s1=new ExOfDefineMainMethodInAnotherClass();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
}

