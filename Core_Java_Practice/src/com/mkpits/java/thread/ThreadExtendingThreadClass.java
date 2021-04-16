//Write a program to java thread to extending thread class
package com.mkpits.java.thread;

class ThreadExtendingThreadClass implements Runnable{
public void run(){
System.out.println("my Thread is running");
}

public static void main(String[] args){
ThreadExtendingThreadClass th=new ThreadExtendingThreadClass();
Thread t= new Thread(th);
t.start();
Thread t1 =new Thread(th);
t1.start();
}
}