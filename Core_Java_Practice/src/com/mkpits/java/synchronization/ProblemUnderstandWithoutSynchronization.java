package com.mkpits.java.synchronization;

public class ProblemUnderstandWithoutSynchronization {
    void printTable(int n){//method not synchronized
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch(Exception e){System.out.println(e);}
        }

    }
}

class MyThread1 extends Thread{
    ProblemUnderstandWithoutSynchronization t;
    MyThread1(ProblemUnderstandWithoutSynchronization t){
        //this.t=t;
    }
    public void run(){
        t.printTable(5);
    }

}
class MyThread2 extends Thread{
    ProblemUnderstandWithoutSynchronization t;
    MyThread2(ProblemUnderstandWithoutSynchronization t){
       // this.t=t;
    }
    public void run(){
        t.printTable(100);
    }
}

class TestSynchronization1{
    public static void main(String args[]){
        ProblemUnderstandWithoutSynchronization obj =
                new ProblemUnderstandWithoutSynchronization();//only one object
        MyThread1 t1=new MyThread1(obj);
        MyThread2 t2=new MyThread2(obj);
        t1.start();
        t2.start();
    }
}

