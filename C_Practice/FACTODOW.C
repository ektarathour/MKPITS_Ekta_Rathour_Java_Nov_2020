#include<stdio.h>
#include<conio.h>
void main()
{
int f=1,i=1,n;
clrscr();
printf("enter a number");
scanf("%d",&n);
do
{
f=f*i;
i++;
}
while(i<=n);
printf("factorial of %d is =%d",n,f);
getch();
}