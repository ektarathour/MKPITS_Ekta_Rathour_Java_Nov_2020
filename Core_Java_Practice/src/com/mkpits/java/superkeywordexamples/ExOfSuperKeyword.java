//Program of superkeyword
package com.mkpits.java.superkeywordexamples;

public class ExOfSuperKeyword {
        int speed=50;
    }
    class Super extends ExOfSuperKeyword
    {
        int speed=100;
        void display()
        {
            System.out.println(super.speed);
        }
        public static void main(String args[])
        {
            Super b=new Super();
            b.display();
        }
    }

