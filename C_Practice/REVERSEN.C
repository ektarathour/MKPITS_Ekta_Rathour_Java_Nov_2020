#include<stdio.h>
#include<conio.h>
void main()
{
int n,reverse=0,rem;
clrscr();
printf("enter number");
scanf("%d",&n);
while(n!=0)
{
rem=n%10;
reverse=reverse*10+rem;
n/=10;
}
printf("\n reverse numberis:%d",reverse);
getch();
}