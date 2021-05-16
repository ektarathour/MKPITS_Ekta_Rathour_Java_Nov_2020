//Java Program to illustrate the use of Rectangle class which
//has length and width data members
package com.mkpits.java.objectandclass;

public class ExOfCreatingRactangleClassObjectByOneTypeOnly {
    int length;
    int width;
    void insert(int l,int w){
        length=l;
        width=w;
    }
    void calculateArea(){System.out.println(length*width);}
}
class TestRectangle2{
    public static void main(String args[]){
        ExOfCreatingRactangleClassObjectByOneTypeOnly r1= new ExOfCreatingRactangleClassObjectByOneTypeOnly()
                ,r2=new ExOfCreatingRactangleClassObjectByOneTypeOnly();//creating two objects
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }
}

