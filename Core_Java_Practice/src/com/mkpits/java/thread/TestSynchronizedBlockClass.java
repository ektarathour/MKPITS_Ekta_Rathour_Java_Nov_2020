//WAP to  synchronized block by using snchronization class
package com.mkpits.java.thread;

class TableSnchro {

    void printTable(int n) {
        synchronized (this) {//synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(n * i);
                try {
                    Thread.sleep(400);
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }//end of the method
}

class Thread1 extends Thread {
    TableSnchro t;

    Thread1(TableSnchro t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }
}

class Thread2 extends Thread {
    TableSnchro t;

    Thread2(TableSnchro t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronizedBlockClass {

    public static void main(String args[]) {
        TableSnchro obj = new TableSnchro();//only one object

        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj) ;
t1.start();
t2.start();

        }
    }
