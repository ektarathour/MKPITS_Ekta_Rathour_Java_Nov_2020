
//Write a program to example of join(long milisecond) method
package com.mkpits.java.thread;

public class TestJoinMethodLongMilli extends Thread {
 public void run(){
  for(int i=1;i<=5;i++){
   try{
  Thread.sleep(500);
 }catch(Exception e){
System.out.println(e);}
System.out.println(i);
}
}
public static void main(String[] args){
TestJoinMethodLongMilli t1=new TestJoinMethodLongMilli();
TestJoinMethodLongMilli t2=new TestJoinMethodLongMilli();
TestJoinMethodLongMilli t3=new TestJoinMethodLongMilli();
t1.start();
try{
t1.join(1500);
}catch(Exception e){
System.out.println(e);}
t2.start();
t3.start();
}
}