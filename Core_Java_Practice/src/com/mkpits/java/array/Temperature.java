//WAP to temparature to denote temp according value
package com.mkpits.java.array;

import java.util.Scanner;

class Temperature {
    private static int temp;

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("enter days temperature");
        temp = sc.nextInt();
        if (temp < 0) {
            System.out.println("freezing weather");
        } else if (temp < 10) {
            System.out.println("very cold weather");
        } else if (temp < 20) {
            System.out.println(" cold weather");
        } else if (temp < 30) {
            System.out.println("normal weather");
        } else if (temp < 40) {
            System.out.println("hot weather");
        } else {
            System.out.println("very hot temperature");
        }
    }
}