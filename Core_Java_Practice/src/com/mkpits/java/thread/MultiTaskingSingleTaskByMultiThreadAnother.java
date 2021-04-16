//WAP to performing another single task ny multiple threads
package com.mkpits.java.thread;
class MultiTaskingSingleTaskByMultiThreadAnother extends Thread{
 public void run(){
  System.out.println("task one");

  }

  public static void main(String[] args){
  MultiTaskingSingleTaskByMultiThreadAnother t1=new MultiTaskingSingleTaskByMultiThreadAnother();
  MultiTaskingSingleTaskByMultiThreadAnother t2=new MultiTaskingSingleTaskByMultiThreadAnother();


  t1.start();
  t2.start();

  }
  }