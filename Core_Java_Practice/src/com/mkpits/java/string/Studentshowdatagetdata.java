 //WAP to  class student having field rno and name and getdata method with 2 parameter and showdata method
 package com.mkpits.java.string;
import java.util.*;
class Student {
    private int rno;
    private String name;

    private void getdata(int rno, String name) {

        {
            rno = rno;
            name = name;
        }

        {
            System.out.println("rno of first student" + rno);
            System.out.println("name of first student" + name);
        }
    }

    public void getdata() {
    }

    public void showdata() {
    }

    static class Studentshowdatagetdata {
        public static void main(String[] args) {
            Studentshowdatagetdata s1 = new Studentshowdatagetdata();
            int rollnumber;
            String studentname;
            Scanner scan = new Scanner(System.in);
            System.out.println("enter student rno");
            rollnumber = scan.nextInt();
            System.out.println("enter student name");
            studentname = scan.next();
            s1.getdata(rollnumber, studentname);
            s1.showdata();
        }

        private void showdata() {
        }

        private void getdata(int rollnumber, String studentname) {
        }
    }
}


