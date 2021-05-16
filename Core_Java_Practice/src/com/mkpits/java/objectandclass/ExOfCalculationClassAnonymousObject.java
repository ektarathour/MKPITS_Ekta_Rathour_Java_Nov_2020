//Program of an anonymous object in Java with calculation class
package com.mkpits.java.objectandclass;

public class ExOfCalculationClassAnonymousObject {
    void fact(int  n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println("factorial is "+fact);
    }
    public static void main(String args[]){
        new ExOfCalculationClassAnonymousObject().fact(5);//calling method with anonymous object
    }
}

