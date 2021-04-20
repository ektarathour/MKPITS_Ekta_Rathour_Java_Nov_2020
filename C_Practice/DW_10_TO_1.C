//Write a program to 10 to 1 number using dowhile loop
#include<stdio.h>
#include<conio.h>
void main()
{
int i=10;
clrscr();
do
{
printf("\n %d",i);
i=i-1;
}
while(i>=1);
getch();
}