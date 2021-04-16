//WAP to performing two task by two threads have two run method
package com.mkpits.java.thread;
class Simple1 extends Thread{
 public void run(){
  System.out.println("task one");

   }
  }

class Simple2 extends Thread{
   public void run(){
    System.out.println("task two");
   }
  }

 class TestMultiTaskingTwoTaskTwoThread extends Thread{
  public static void main(String[] args){
  Simple1 t1=new Simple1();
  Simple2 t2=new Simple2();

  t1.start();
  t2.start();
  }
  }