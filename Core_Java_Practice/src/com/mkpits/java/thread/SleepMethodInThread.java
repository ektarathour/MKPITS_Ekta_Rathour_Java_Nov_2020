//Example of sleep method in java
package com.mkpits.java.thread;

public class SleepMethodInThread extends Thread{
    public void run() {
        for (int i = 1; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }

    public static void main(String args[]) {
        SleepMethodInThread  t1 = new SleepMethodInThread ();
        SleepMethodInThread  t2 = new SleepMethodInThread ();

        t1.start();
        t2.start();
    }
}
