//WAP to  thread priority
package com.mkpits.java.thread;
class Thpr extends Thread{
 public void run(){
  System.out.println("running thread name is :"+Thread.currentThread().getName());
  System.out.println("running thread priority is :"+Thread.currentThread().getPriority());
  }

  public static void main(String[] args){
  Thpr t1=new Thpr();
  Thpr t2=new Thpr();
  Thpr t3=new Thpr();
  t1.setPriority(Thread.MIN_PRIORITY);
  t3.setPriority(Thread.MAX_PRIORITY);
  t1.start();
  t2.start();
  t3.start();
  }
  }