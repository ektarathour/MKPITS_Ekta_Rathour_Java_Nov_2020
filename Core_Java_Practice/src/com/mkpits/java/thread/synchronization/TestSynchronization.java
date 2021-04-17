//WAP to no synchronization,so output is inconsistance
package com.mkpits.java.thread.synchronization;
class Table{

void printTable(int n){//method not synchronized
for(int i=1;i<=5;i++){
System.out.println(n*i);
try{
Thread.sleep(400);
}catch(Exception e){System.out.println(e);}
}
}
}//end of the method

class MyThread1 extends Thread{
TableEx t;
MyThread1(TableEx t){
this.t=t;
}
public void run(){

    t.printTable(5);
}

}
class MyThread2 extends Thread{
TableEx t;
MyThread2(TableEx t){
this.t=t;
}
public void run(){
t.printTable(100);
}
}
public class TestSynchronization{
public static void main(String args[]){
TableEx obj=new TableEx();//only one object
MyThread1 t1=new MyThread1(obj);
MyThread2 t2=new MyThread2(obj);
t1.start();
t2.start();
}
}