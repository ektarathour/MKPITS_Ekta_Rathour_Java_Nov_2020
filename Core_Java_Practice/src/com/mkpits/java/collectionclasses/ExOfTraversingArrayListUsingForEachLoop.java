//A program on traversing arraylist using foreach loop
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Scanner;

public class ExOfTraversingArrayListUsingForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++) {
            System.out.println("enter student name");
            String sn=sc.next();
            stud.add(sn);
        }
        stud.forEach(x -> {System.out.println(x);});

    }
}



