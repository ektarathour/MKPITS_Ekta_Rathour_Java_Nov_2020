//Write a program to check  start thread twice
package com.mkpits.java.thread;

 public class TestThreadTwice extends Thread {
public void run(){
System.out.println("my Thread is running");
}

public static void main(String[] args){
TestThreadTwice t1=new TestThreadTwice();
t1.start();
t1.start();
}
}