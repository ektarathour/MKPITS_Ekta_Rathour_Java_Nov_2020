//WAP to java Thread Example by extending Thread class
package com.mkpits.java.thread;
class ExtendingThredClass extends Thread{
public void run(){
System.out.println("thread is running");
}

public static void main(String[] args){
    ExtendingThredClass t1=new ExtendingThredClass();
t1.start();
}
}