package com.mkpits.java.loops;//example of print  1 to  from given number by user  using  while loop

import java.util.*;

class Print1toUserInteredNoW {
    public static void main(String[] args) {
        int i = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of n");
        int n = sc.nextInt();
        System.out.println("number are");
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
