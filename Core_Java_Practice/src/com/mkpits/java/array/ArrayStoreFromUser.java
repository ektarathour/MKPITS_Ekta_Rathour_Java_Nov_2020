//WAP to array of integer accept value from the user user in the array
package com.mkpits.java.array;
import java.util.*;
class ArrayStoreFromUser
{
public static void main(String[] args)
{
int arr[]=new int[5];
for(int i=0;i<5;i++)
{
System.out.println("enter number");
Scanner sc=new Scanner(System.in);
arr[i]=sc.nextInt();
}
for(int i=0;i<5;i++)
{
System.out.println(arr[i]);
}
}
}