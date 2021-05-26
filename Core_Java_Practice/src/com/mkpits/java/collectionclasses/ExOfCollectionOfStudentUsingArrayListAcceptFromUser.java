//A program of accepting name of student from the user
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Scanner;

public class ExOfCollectionOfStudentUsingArrayListAcceptFromUser {
    public static void main(String[] args){
        ArrayList<String> stud=new ArrayList<String>();
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=3;i++){
            System.out.println("Enter student name name");
            String sn=sc.next();
            stud.add(sn);
        System.out.println(stud);
    }
}
}
