//WAP to synchronization method
package com.mkpits.java.thread.synchronization;
class TableEx {
    synchronized void printTable(int n) {//synchronized method
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

class MyThreadEx1 extends Thread {
    TableEx t;

    MyThreadEx1(TableEx t) {
        this.t = t;
    }

    public void run() {
        t.printTable(5);
    }

}

class MyThreadEx2 extends Thread {
    TableEx t;

    void MyThread2(TableEx t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}

public class TestSynchronizationMethod {
    public static void main(String args[]) {
        TableEx obj = new TableEx();//only one object
        MyThread1 t1 = new MyThread1(obj);
        MyThread2 t2 = new MyThread2(obj);
        t1.start();
        t2.start();
    }
}