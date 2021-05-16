//another example that maintains the records of Rectangle class
package com.mkpits.java.objectandclass;

public class RactangleMainClassThatMaintainRecordRactangleClass {
    int length;
    int width;
    void insert(int l, int w){
        length=l;
        width=w;
    }
    void calculateArea(){System.out.println(length*width);}
}
class TestRectangle1{
    public static void main(String args[]){
        RactangleMainClassThatMaintainRecordRactangleClass r1=new RactangleMainClassThatMaintainRecordRactangleClass();
        RactangleMainClassThatMaintainRecordRactangleClass r2=new RactangleMainClassThatMaintainRecordRactangleClass();
        r1.insert(11,5);
        r2.insert(3,15);
        r1.calculateArea();
        r2.calculateArea();
    }
}

