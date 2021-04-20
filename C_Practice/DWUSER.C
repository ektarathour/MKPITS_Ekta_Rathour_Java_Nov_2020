//Write a program to  accept number  and print the number from the user enterd using dowhile loop
#include<stdio.h>
#include<conio.h>
void main()
{
int i=1;
int num;
clrscr();
printf("enter number");
scanf("%d",&num);
do
{
printf(" %d \t",i);
i=i+1;
}
while(i<=num);
getch();
}