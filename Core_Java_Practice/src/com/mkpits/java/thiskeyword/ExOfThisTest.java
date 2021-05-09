package com.mkpits.java.thiskeyword;

public class ExOfThisTest {
    int id;
    String name;
    ExOfThisTest(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println(id+" "+name);
    }
    public static void main(String args[])
    {
        ExOfThisTest s1 = new ExOfThisTest(142,"Shamshad");
        ExOfThisTest s2 = new ExOfThisTest(452,"John");
        s1.display();
        s2.display();
    }
}

