//Example of current  thread
package com.mkpits.java.thread;

class TestCurrentThread extends Thread{
 public void run(){
  System.out.println(Thread.currentThread().getName());
 }

  public static void main(String[] args){
  TestCurrentThread t1=new TestCurrentThread();
  TestCurrentThread t2=new TestCurrentThread();

  t1.start();
  t2.start();
}
}
