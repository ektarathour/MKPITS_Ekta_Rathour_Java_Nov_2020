//WAP of print grade of user enterd number
package com.mkpits.java.multipalprograms;

import java.util.Scanner;

class Grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();
        if (num > 75) {
            System.out.println("exellent");
        } else if (num >= 60 && num < 75) {
            System.out.println("very good");
        } else if (num >= 55 && num < 60) {
            System.out.println("good");
        } else if (num >= 33 && num < 55) {
            System.out.println("average");
        } else {
            System.out.println("fail");
        }
    }
}
