//WAP to  thread pool using ExecutorService and Executors
package com.mkpits.java.thread;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
class WorkerThread implements Runnable
{
  private String message;
  public WorkerThread(String s)
 {
 this.message=s;
 }
 public void run()
 {
System.out.println(Thread.currentThread().getName()+"(Start)message="+message);
proccessmessage();
System.out.println(Thread.currentThread().getName()+"(End)");
}
private void proccessmessage(){
try{Thread.sleep(2000);}catch(InterruptedException e)
{
e.printStackTrace();}
}
}


