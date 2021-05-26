//A program of traversing list through iterator using student name collection
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ExOfTraversingListThroughIteratorStudent {
    public static void main(String[] args) {
        ArrayList<String> stud = new ArrayList<String>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter student name name");
            String sn = sc.next();
            stud.add(sn);
            Iterator itr = stud.iterator();
            while (itr.hasNext()) {
                System.out.println("student name:" + itr.next());
            }
        }
    }
}

