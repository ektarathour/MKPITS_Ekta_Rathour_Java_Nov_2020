//WAP to performing single task by multiple threads
package com.mkpits.java.thread;
class MultiTaskingSingleTaskByMultiThread extends Thread{
 public void run(){
  System.out.println("task one");

  }

  public static void main(String[] args){
  MultiTaskingSingleTaskByMultiThread t1=new MultiTaskingSingleTaskByMultiThread();
  MultiTaskingSingleTaskByMultiThread t2=new MultiTaskingSingleTaskByMultiThread();
  MultiTaskingSingleTaskByMultiThread t3=new MultiTaskingSingleTaskByMultiThread();

  t1.start();
  t2.start();
  t3.start();
  }
  }