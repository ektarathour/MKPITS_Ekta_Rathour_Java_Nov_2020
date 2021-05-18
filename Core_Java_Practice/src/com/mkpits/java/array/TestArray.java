//WAP to  how to declare,instantiate initialize and traversing the array
package com.mkpits.java.array;

class TestArray {
    public static void main(String[] args) {
        int a[] = new int[5];//declaration and instantiation
        a[0] = 10;
        a[1] = 20;
        a[2] = 70;
        a[3] = 40;
        a[4] = 50;
//traversing array
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i]);
    }
}