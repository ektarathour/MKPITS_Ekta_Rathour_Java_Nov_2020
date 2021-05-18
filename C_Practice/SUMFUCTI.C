#include<stdio.h>
#include<conio.h>
int sum()
{
int num1=10,num2=20;
int sum=num1+num2;
return sum;
}
void main()
{
int result;
clrscr();
result=sum();
printf("\n sum of two number=%d",result);
getch();
}
