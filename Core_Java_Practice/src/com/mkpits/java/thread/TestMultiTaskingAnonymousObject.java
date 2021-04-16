// example of performing single task ny multiple threads passing annonymous object
package com.mkpits.java.thread;

class TestMultiTaskingAnonymousObject implements Runnable{
 public void run(){
  System.out.println("task one");

  }

  public static void main(String[] args){
  Thread t1=new Thread(new TestMultiTaskingAnonymousObject()); //passing annonymous object of TestMultiTasking2 class
  Thread t2=new Thread(new TestMultiTaskingAnonymousObject());

  t1.start();
  t2.start();
  }
  }