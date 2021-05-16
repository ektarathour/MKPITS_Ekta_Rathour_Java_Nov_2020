//WAP to synchronization method
package com.mkpits.java.synchronization;
 class TestSynchronizationMethod {
     {
        // synchronized  void printTable(int n){//synchronized method

         for (int i = 1; i <= 5; i++) {
            // System.out.println(n * i);
             try {
                 Thread.sleep(400);
             } catch (Exception e) {
                 System.out.println(e);
             }
         }
     }
     }//end of the method

     class MyThreadEx1 extends Thread {
         TestSynchronizationMethod t;

         MyThreadEx1(TestSynchronizationMethod t)
         {
             //this.t = t;
         }

         public void run() {
           //  t.printTable(5);
         }



     private void printTable(int i) {
     }

     class MyThreadEx2 extends Thread {
         ProblemUnderstandWithoutSynchronization t;

         void MyThread2(ProblemUnderstandWithoutSynchronization t) {

             //this.t = t;
         }

         public void run() {
             t.printTable(100);
         }
     }

     public static class TestSynchronizationMethodMain {
         public static void main(String args[]) {
             ProblemUnderstandWithoutSynchronization obj =
                     new ProblemUnderstandWithoutSynchronization();//only one object
             MyThread1 t1 = new MyThread1(obj);
             MyThread2 t2 = new MyThread2(obj);
             t1.start();
             t2.start();
         }
     }
 }