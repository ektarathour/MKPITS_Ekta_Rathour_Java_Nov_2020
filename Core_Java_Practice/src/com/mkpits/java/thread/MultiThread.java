//Write a program to java thread to extending thread class
package com.mkpits.java.thread;
class MultiThread extends Thread{
public void run(){
System.out.println("thread is running");
}

public static void main(String[] args){
MultiThread t1=new MultiThread();
t1.start();
}
}