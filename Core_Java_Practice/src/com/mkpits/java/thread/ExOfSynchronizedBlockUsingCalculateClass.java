//A program to synchronized block using calculate class
package com.mkpits.java.thread;

public class ExOfSynchronizedBlockUsingCalculateClass {
    public void addition(int n1, int n2) {
        synchronized (this) {
            for (int i = 1; i <= 3; i++) {
                int res = n1 + n2;
                System.out.println(Thread.currentThread().getName() + "add:" + res);
                try {
                    Thread.sleep(1000);
                } catch (Exception ee) {

                }
            }
        }
    }
}

 class SynchroMain {
    public static void main(String[] args) {
        ExOfSynchronizedBlockUsingCalculateClass cal =
                new ExOfSynchronizedBlockUsingCalculateClass();
        Thread t1 = new Thread() {
            public void run() {
                cal.addition(2, 3);
            }
        };
        Thread t2 = new Thread() {
            public void run() {
                cal.addition(5, 2);
            }
        };
        t1.start();
        t2.start();
    }
}
