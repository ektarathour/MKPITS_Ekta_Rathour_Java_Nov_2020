//Program of use of override of ToString method
package com.mkpits.java.tostringexamples;

public class ExOfStudentOverrideToStringMethod {
    String name;
    String rollNo;

    //constructor
    ExOfStudentOverrideToStringMethod(String name, String rollNo){
        this.name = name;
        this.rollNo = rollNo;
    }

    //Override toString method to get customize results.
    public String toString(){
        return "Name:" + name + ", RollNo: " + rollNo;
    }
}

 class ToStringExample2 {
    public static void main(String args[]){
        //creating Student class object
        ExOfStudentOverrideToStringMethod stu1 = new ExOfStudentOverrideToStringMethod("Sunil", "MCA/07/15");
        ExOfStudentOverrideToStringMethod stu2 = new ExOfStudentOverrideToStringMethod("Sandy", "MCA/07/19");
        ExOfStudentOverrideToStringMethod stu3 = new ExOfStudentOverrideToStringMethod("Roxy", "MCA/07/32");

        //println internally call toString method
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);
    }
}

