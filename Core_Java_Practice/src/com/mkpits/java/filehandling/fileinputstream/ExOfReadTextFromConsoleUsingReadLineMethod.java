//A program to read a single line of text from the console using readline method
package com.mkpits.java.filehandling.fileinputstream;

import java.io.Console;

public class ExOfReadTextFromConsoleUsingReadLineMethod {
    public static void main(String args[]){
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
    }
}

