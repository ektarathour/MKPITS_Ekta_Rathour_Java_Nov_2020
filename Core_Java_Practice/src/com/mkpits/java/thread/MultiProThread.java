//WAP to  multiplication of of user given number
package com.mkpits.java.thread;

class MultiProThread extends Thread{
public void run(){
System.out.println("thread is running");
}

public static void main(String[] args){
MultiProThread t1=new MultiProThread();
t1.start();
}
}