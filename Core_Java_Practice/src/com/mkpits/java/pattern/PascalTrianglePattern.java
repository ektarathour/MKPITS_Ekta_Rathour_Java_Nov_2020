/*  WAP to pascal�s Triangle Program in Java

      1
    1   1
  1   2  1
 1   3  3  1
1  4   6  4 1   */


package com.mkpits.java.pattern;
public class PascalTrianglePattern
{
public static void main(String[] args){
for (int i = 0; i < 5; i++) {
for (int j = 1; j <5-i; j++) {
System.out.print(" ");
}
int number=1;
for (int k =0; k<=i; k++) {

System.out.print(number + " ");
number=number*(i-k)/(k+1);
}
System.out.println();
}
}
}