//Understanding the problem without this keyword

package com.mkpits.java.thiskeyword;

public class ExOfUnderstandingProblemWithoutThisKey {
    int rollno; //instance variable
    String name;
    float fee;
    ExOfUnderstandingProblemWithoutThisKey(int rollno,String name,float fee)
    {
        rollno=rollno;
        name=name;
        fee=fee;
    }

    void display(){System.out.println(rollno+" "+name+" "+fee);}
}
class TestThis1{
    public static void main(String args[]){
        ExOfUnderstandingProblemWithoutThisKey s1=new ExOfUnderstandingProblemWithoutThisKey(111,"ankit",5000f);
        ExOfUnderstandingProblemWithoutThisKey s2=new ExOfUnderstandingProblemWithoutThisKey(112,"sumit",6000f);
        s1.display();
        s2.display();
    }
}
