//A program of account class which is imported by another class
package com.mkpits.java.packageexample;

public class Account {
    public int bal=1000;
    public String deposit(int amt){
        bal=bal+amt;
        return "deposited,bal is "+bal;
    }
}
