//A program of testbank class in which we import account class
package com.mkpits.java.packageexample.packageprogram1;

import com.mkpits.java.packageexample.Account;

import java.util.Scanner;

public class TestBank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in) ;
          System.out.println("enter amount to deposit");
            int amount = s.nextInt();
            Account act = new Account();
            String str = act.deposit(amount);
          System.out.println(str);
        }
    }
