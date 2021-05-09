//WAP to call by value that value will be change if we passing object as a value
package com.mkpits.java.callbyvalue;
class OperationCallByValueChange
{
int data=50;
void change(OperationCallByValueChange op)
{
op.data=op.data+100;//change will be in the instance variable
}
public static void main(String[] args)
{
OperationCallByValueChange op=new OperationCallByValueChange();
System.out.println("before change"+op.data);
op.change(op);//passing object
System.out.println("after change"+op.data);
}
}
