//Program of Java class to test the encapsulated class.
package com.mkpits.java.encapsulationPrograms;

public class ExOfStudentClassToTestEncapsulatedClass {
    public static void main(String[] args){
//creating instance of the encapsulated class
        ExOfStudentClassWithGetAndSetMethod s=new ExOfStudentClassWithGetAndSetMethod();
//setting value in the name member
        s.setName("vijay");
//getting value of the name member
        System.out.println(s.getName());
    }
}

