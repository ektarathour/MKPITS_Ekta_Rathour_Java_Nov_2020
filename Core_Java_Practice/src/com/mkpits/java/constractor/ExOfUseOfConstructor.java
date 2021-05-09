//Java Program to Illustrate Use of Constructor
package com.mkpits.java.constractor;

public class ExOfUseOfConstructor {
    double width;
    double height;
    double depth;
    ExOfUseOfConstructor()
    {
        System.out.println("Constructor without parameter");
        width = 10;
        height = 10;
        depth = 10;
    }
    ExOfUseOfConstructor(int a, int b, int c)
    {
        System.out.println("Constructor with parameter");
        width = a;
        height = b;
        depth = c;
    }
    double volume()
    {
        return width * height * depth;
    }
}
class ConstructorDemo
{
    public static void main(String args[])
    {
        ExOfUseOfConstructor cuboid1 = new ExOfUseOfConstructor();
        double vol;
        vol = cuboid1.volume();
        System.out.println("Volume is " + vol);
        ExOfUseOfConstructor cuboid2 = new ExOfUseOfConstructor(8,11,9);
        vol = cuboid2.volume();
        System.out.println("Volume is " + vol);
    }
}



