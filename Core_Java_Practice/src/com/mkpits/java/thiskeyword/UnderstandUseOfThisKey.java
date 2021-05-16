//In the above example, parameters (formal arguments) and instance variables
// are same. So, we are using this keyword to distinguish local variable and instance
// variable.
package com.mkpits.java.thiskeyword;

public class UnderstandUseOfThisKey {
    int rollno;
    String name;
    float fee;
    UnderstandUseOfThisKey(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis2{
    public static void main(String args[]){
        UnderstandUseOfThisKey s1=new UnderstandUseOfThisKey(111,"ankit",5000f);
        UnderstandUseOfThisKey s2=new UnderstandUseOfThisKey(112,"sumit",6000f);
        s1.display();
        s2.display();
    }}


