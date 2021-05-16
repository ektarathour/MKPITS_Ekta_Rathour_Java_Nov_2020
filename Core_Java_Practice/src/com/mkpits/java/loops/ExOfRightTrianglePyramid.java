//A program of right triangle pyramid
package com.mkpits.java.loops;

class ExOfRightTrianglePyramid {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();//new line
        }
    }
}

