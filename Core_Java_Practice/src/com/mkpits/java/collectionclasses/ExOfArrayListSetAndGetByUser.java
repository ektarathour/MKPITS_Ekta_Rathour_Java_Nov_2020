//A program of set and get method in arraylist by user
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Scanner;

public class ExOfArrayListSetAndGetByUser {
    public static void main(String[] args) {
        //Creating a list
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter student name");
            String sn = sc.next();
            stud.add(sn);
        }
        System.out.println("student at index 1:" + stud.get(1));
        stud.set(1, "Ekta");
        for (String str : stud) {
            System.out.println("student name:" + str);
        }
    }
}

