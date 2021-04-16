//Wap  to main ThreadStack problem if you  direact call  run method
package com.mkpits.java.thread;

class TestCallRunThreadStackProblem extends Thread
{
  public void run()
  {
   	for(int i=1;i<=5;i++)
  	{
     try
       {
	   Thread.sleep(500);
	   }
    	catch(InterruptedException e)
        {
  System.out.println(e);
	    }
  System.out.println(i);
   }
  }
  public static void main(String[] args)
  {
  TestCallRunThreadStackProblem  t1=new TestCallRunThreadStackProblem ();
  TestCallRunThreadStackProblem  t2=new TestCallRunThreadStackProblem ();
  t1.run();
  t2.run();
  }
}

