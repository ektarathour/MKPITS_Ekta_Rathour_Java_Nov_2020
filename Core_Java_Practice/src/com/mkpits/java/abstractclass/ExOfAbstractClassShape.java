//Program to Abstract class
package com.mkpits.java.abstractclass;

public abstract class ExOfAbstractClassShape {
    public abstract void calculatearea();
    }
 class circle<area> extends ExOfAbstractClassShape {
     int x;
     int y;
     int radius;
     public circle()
     {
        x = 15;
        y = 15;
        radius = 10;
    }

    public void calculatearea()
    {
        double area = 3.14 * (radius * radius);

    }
//System.out.println("area+"+area);
 }


class test1
{

    public static  void main(String[] args)
    {
        ExOfAbstractClassShape s =null;
        s=new circle();
        s.calculatearea();
    }
}
