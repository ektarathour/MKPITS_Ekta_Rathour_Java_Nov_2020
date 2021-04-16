//Write a program to java thread to implimenting runnable interface
package com.mkpits.java.thread;

class Multi1ThreadImplementing implements Runnable{
public void run(){
System.out.println("thread is running");
}

public static void main(String[] args){
Multi1ThreadImplementing m1=new Multi1ThreadImplementing();
Thread t1=new Thread(m1);
t1.start();
}
}