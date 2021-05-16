//Program of inheritance in which Programmer is the subclass and Employee is the superclass
package com.mkpits.java.inheritance;

public class ExOfEmployeeClassUsingInheritance {
    float salary=40000;
}
class Programmer extends ExOfEmployeeClassUsingInheritance{
    int bonus=10000;
    public static void main(String args[]){
        Programmer p=new Programmer();
        System.out.println("Programmer salary is:"+p.salary);
        System.out.println("Bonus of Programmer is:"+p.bonus);
    }
}

