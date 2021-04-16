//create  a  2d array 3 row and 3 column
package com.mkpits.java.array;
import java.util.*;
class TwoDArray{
 public static void main(String[] args){
  int[][] arr=new int[3][3];
  int rows = 0;
  for(int row = 0; rows<3; rows++){
   for(int column=0;column<3;column++){
    {
    System.out.println("enter number");
    }
    Scanner s=new Scanner(System.in);
      arr[row][column]=s.nextInt();
	   }
        for( row=0;row<3;row++){
         for(int column=0;column<3;column++){
          System.out.print(arr[row][column]+"\t");
           }
         System.out.println();
	    }
	}
  }
}