//example creating the two objects of Student class and initializing the value to these
// objects by invoking the insertRecord method
package com.mkpits.java.objectandclass;

class ExOfInitializeObjectThroughMethod {
    int rollno;
    String name;
    void insertRecord(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInformation(){System.out.println(rollno+" "+name);}
}
class TestStudent4{
    public static void main(String args[]){
        ExOfInitializeObjectThroughMethod s1=new ExOfInitializeObjectThroughMethod();
        ExOfInitializeObjectThroughMethod s2=new ExOfInitializeObjectThroughMethod();
        s1.insertRecord(111,"Karan");
        s2.insertRecord(222,"Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}

