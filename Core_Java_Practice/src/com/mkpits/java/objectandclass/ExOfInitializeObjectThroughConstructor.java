//example where we are maintaining records of employees.
package com.mkpits.java.objectandclass;

public class ExOfInitializeObjectThroughConstructor {
    int id;
    String name;
    float salary;
    void insert(int i, String n, float s) {
        id=i;
        name=n;
        salary=s;
    }
    void display(){System.out.println(id+" "+name+" "+salary);}
}
class TestEmployee {
    public static void main(String[] args) {
        ExOfInitializeObjectThroughConstructor e1 = new ExOfInitializeObjectThroughConstructor();
        ExOfInitializeObjectThroughConstructor e2 = new ExOfInitializeObjectThroughConstructor();
        ExOfInitializeObjectThroughConstructor e3 = new ExOfInitializeObjectThroughConstructor();
        e1.insert(101, "ajeet", 45000);
        e2.insert(102, "irfan", 25000);
        e3.insert(103, "nakul", 55000);
        e1.display();
        e2.display();
        e3.display();
    }
}