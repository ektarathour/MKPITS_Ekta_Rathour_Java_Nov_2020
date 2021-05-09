//Program use super keyword to access the variables of parent class
package com.mkpits.java.superkeywordexamples;

public class ExOfuseSuperKeywordAccessParentClass {
    int num = 100;
}
//Child class or subclass or derived class
class SubclassLocal1 extends ExOfuseSuperKeywordAccessParentClass
{
    /* The same variable num is declared in the Subclass
     * which is already present in the Superclass
     */
    int num = 110;
    void printNumber(){
        System.out.println(num);
    }
    public static void main(String args[]){
        SubclassLocal1 obj= new SubclassLocal1();
        obj.printNumber();
    }
}

