//Program to implementing thread
package com.mkpits.java.thread;

public class ExOfImplementingThread implements Runnable{
    public static void main(String[] args) {
        ExOfImplementingThread obj = new ExOfImplementingThread();
        Thread thread = new Thread(obj);
        thread.start();
        System.out.println("This code is outside of the thread");
    }
    public void run() {
        System.out.println("This code is running in a thread");
    }
}

