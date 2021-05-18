//Example of check array equal or not
package com.mkpits.java.array;

import java.util.Arrays;

public class ExOfCheckArrayEquals {
    public static void main(String[] args)
    {

        int a[] = { 30, 25, 40 };

        int b[] = { 30, 25, 40 };

        boolean result = Arrays.equals(a, b);

        if (result == true) {
            // Print the result
            System.out.println("Two arrays are equal");
        }
        else {
            // Print the result
            System.out.println("Two arrays are not equal");
        }
    }
}

