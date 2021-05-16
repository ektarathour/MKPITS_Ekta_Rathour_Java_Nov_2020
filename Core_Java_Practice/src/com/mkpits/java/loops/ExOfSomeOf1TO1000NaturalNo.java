// Program to find the sum of natural numbers from 1 to 1000
package com.mkpits.java.loops;

public class ExOfSomeOf1TO1000NaturalNo {

        public static void main(String[] args) {

            int sum = 0;
            int n = 1000;

            // for loop
            for (int i = 1; i <= n; ++i) {
                // body inside for loop
                sum += i;     // sum = sum + i
            }

            System.out.println("Sum = " + sum);
        }
    }

