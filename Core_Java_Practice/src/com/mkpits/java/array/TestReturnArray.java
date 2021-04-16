//WAP to creating method which return a array

package com.mkpits.java.array;

class TestReturnArray {
    static int[] get() {
        return new int[]{10, 30, 50, 90, 60};
    }

    public static void main(String[] args) {
//calling method which return an array
        int arr[] = get();
//printing the value of an array
        for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
    }
}
