//Example of create multiple objects and store information in it through reference variable.
package com.mkpits.java.objectandclass;

public class ExOfInitializeObjectThroughReferenceVariable {
    int id;
    String name;
}
class TestStudent2{
    public static void main(String args[]){
        ExOfInitializeObjectThroughReferenceVariable s1=new ExOfInitializeObjectThroughReferenceVariable();
        s1.id=101;
        s1.name="Sonoo";
        System.out.println(s1.id+" "+s1.name);//printing members with a white space
    }
}

