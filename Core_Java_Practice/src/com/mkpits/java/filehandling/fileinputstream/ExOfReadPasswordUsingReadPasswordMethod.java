//A program of Java Console Example to read password
package com.mkpits.java.filehandling.fileinputstream;

import java.io.Console;

public class ExOfReadPasswordUsingReadPasswordMethod {
    public static void main(String args[]) {
        Console c = System.console();
        System.out.println("Enter password: ");
        char[] ch = c.readPassword();
        String pass = String.valueOf(ch);//converting char array into string

        System.out.println("Password is: " + pass);
    }
}