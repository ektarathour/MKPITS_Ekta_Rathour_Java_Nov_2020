//WAP to run a thread by direactly calling the run method
package com.mkpits.java.callrunmethod;
class TestCallRunMethodDirect extends Thread{
 public void run(){
  System.out.println("running");
 }

  public static void main(String[] args){
  TestCallRunMethodDirect t1=new TestCallRunMethodDirect();
  t1.run();//fine,but does not start a seprate call stack
}
}
