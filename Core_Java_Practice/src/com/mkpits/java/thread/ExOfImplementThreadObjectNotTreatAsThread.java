//extending the Thread class,your class object would not be treated as a thread object.So you need to explicitely create Thread class object
package com.mkpits.java.thread;

public class ExOfImplementThreadObjectNotTreatAsThread implements Runnable {
    public void run() {
        for(int i=1;i<25;i++) {
            System.out.println("my thread is running " + i);
        }
    }

    public static void main(String[] arg) {
        ExOfImplementThreadObjectNotTreatAsThread th=
                new ExOfImplementThreadObjectNotTreatAsThread();
        Thread t=new Thread(th);
        t.start();
        Thread t1=new Thread(th);
        t1.start();
    }

}
