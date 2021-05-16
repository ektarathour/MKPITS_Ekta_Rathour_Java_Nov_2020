//Example of currentThread() method
package com.mkpits.java.thread;

public class ExOfCurrentThreadMethodUsingJoin extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String args[]){
        ExOfCurrentThreadMethodUsingJoin t1=new ExOfCurrentThreadMethodUsingJoin();
        ExOfCurrentThreadMethodUsingJoin t2=new ExOfCurrentThreadMethodUsingJoin();

        t1.start();
        t2.start();
    }


    }

