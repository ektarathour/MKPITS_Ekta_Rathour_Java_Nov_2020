//A program of array list where we are storing student class object in an array list
package com.mkpits.java.collectionclasses;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno,String name,int age){
        this.rollno=rollno;
        this.name=name;
        this.age=age;
    }
}
public class ExOfStoringStudentClassObjectInArrayList {
    public static void main(String[] args){
        Student s1=new Student(101,"Ekta",26);
        Student s2=new Student(102,"Rani",24);
        Student s3=new Student(103,"Jitu",23);
        ArrayList<Student> stud=new ArrayList<Student>();
        stud.add(s1);
        stud.add(s2);
        stud.add(s3);
        Iterator itr=stud.iterator();
        while(itr.hasNext()){
           Student st=(Student)itr.next();
           System.out.println(st.rollno+" "+st.name+" "+st.age);
        }

    }
}
