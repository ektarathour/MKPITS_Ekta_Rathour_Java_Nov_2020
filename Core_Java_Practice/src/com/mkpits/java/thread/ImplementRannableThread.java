//WAP to java thread to implimenting runnable interface
package com.mkpits.java.thread;
class ImplementRannableThread implements Runnable {
    public void run() {
        System.out.println("thread is running");
    }

    public static void main(String[] args) {
        ImplementRannableThread m1 = new ImplementRannableThread();
        Thread t1 = new Thread(m1);
        t1.start();
    }
}