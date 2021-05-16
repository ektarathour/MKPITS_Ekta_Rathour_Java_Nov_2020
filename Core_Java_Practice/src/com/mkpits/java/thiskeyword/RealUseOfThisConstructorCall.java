//RealUseOfThisConstructorCall
package com.mkpits.java.thiskeyword;

public class RealUseOfThisConstructorCall {
    int rollno;
    String name,course;
    float fee;
    RealUseOfThisConstructorCall(int rollno,String name,String course)
    {
        this.rollno=rollno;
        this.name=name;
        this.course=course;
    }
    RealUseOfThisConstructorCall(int rollno,String name,String course,float fee)
    {
        this(rollno,name,course);//reusing constructor
        this.fee=fee;
    }
    void display(){System.out.println(rollno+" "+name+" "+course+" "+fee);}
}
class TestThis7{
    public static void main(String args[]){
        RealUseOfThisConstructorCall s1=new
                RealUseOfThisConstructorCall(111,"ankit","java");
        RealUseOfThisConstructorCall s2=new
                RealUseOfThisConstructorCall(112,"sumit","java",6000f);
        s1.display();
        s2.display();
    }}