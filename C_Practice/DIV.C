//write a program to accept two number and calculate division of number
#include<stdio.h>
#include<conio.h>
void main()
{
int num1,num2,div;
clrscr();
printf("enter the number1");
scanf("%d",&num1);
printf("enter the number2");
scanf("%d",&num2);
div=num1/num2;
printf("divition of two number=%d", div);
getch();
}