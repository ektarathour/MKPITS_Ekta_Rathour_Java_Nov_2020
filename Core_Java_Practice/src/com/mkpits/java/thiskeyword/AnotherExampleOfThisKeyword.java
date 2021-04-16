//WAP to calling parameterized contructor from default constructor
package com.mkpits.java.thiskeyword;

public class AnotherExampleOfThisKeyword {
        int x;

    AnotherExampleOfThisKeyword () {

        x = 20;
        System.out.println("hello x=" + x);//20
    }
    AnotherExampleOfThisKeyword (int x)
        {
            this();
            System.out.println(x); //20
        }
    }
    class  TestthisClassAnother //creating a class
    {


        public static void main(String[] args)
        {
            AnotherExampleOfThisKeyword  a=new AnotherExampleOfThisKeyword() ;

        }
    }

