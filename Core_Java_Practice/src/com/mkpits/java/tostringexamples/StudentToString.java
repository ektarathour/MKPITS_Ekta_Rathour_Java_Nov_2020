package com.mkpits.java.tostringexamples;

public class StudentToString {

        int rollno;
        String name;
        String city;
        StudentToString(int rollno,String name,String city)
        {
            this.rollno=rollno;
            this.name=name;
            this.city=city;
        }
        public String toString()
        {
            return rollno+""+name+""+city;
        }
        public static void main(String[] args)
        {
            StudentToString s1=new StudentToString(101,"Ekta","Nagpur");
            StudentToString s2=new StudentToString(102,"rani","Patna");
            System.out.println(s1);
            System.out.println(s2);
        }
    }


