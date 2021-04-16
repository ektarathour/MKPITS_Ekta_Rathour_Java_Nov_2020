
//Write a program to example of getName(),setNmae(String),getId() method
package com.mkpits.java.thread;

class TestJoinMethodEx extends Thread {
 public void run(){
System.out.println("running");
}

public static void main(String[] args){
TestJoinMethodEx t1=new TestJoinMethodEx();
TestJoinMethodEx t2=new TestJoinMethodEx();
System.out.println("name of t1:"+t1.getName());
System.out.println("name of t2:"+t2.getName());
System.out.println("id of t1:"+t1.getId());
t1.start();
t2.start();
t1.setName("Ekta Rathour");
System.out.println("After changing name of t1:"+t1.getName());
}
}