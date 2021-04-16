//WAP TO call by value in that case original value is not changed
package com.mkpits.java.callbyvalue;

public class OperationCallByValue
{
int data=50;
void change(int data)
{
data=data+100;//change Will be in the local variable only
}
public static void main(String[] args)
{
OperationCallByValue op=new OperationCallByValue();
System.out.println("before change"+op.data);
op.change(500);
System.out.println("after change"+op.data);
}
}