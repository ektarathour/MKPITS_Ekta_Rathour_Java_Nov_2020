//WAP to passing anonymous array to the method
package com.mkpits.java.array;

public class TestAnonymousArray {
    static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }

    public static void main(String args[]) {
        printArray(new int[]{10, 22, 44, 66});
    }
}