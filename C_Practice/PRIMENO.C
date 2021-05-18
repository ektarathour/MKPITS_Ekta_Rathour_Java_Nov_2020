#include<stdio.h>
#include<conio.h>
void main()
{
int num,rem,i=2;
clrscr();
printf("enter number");
scanf("%d",&num);
while(i<num)
{
rem=num%i;
if(rem==0)
{
printf("\n number is not prime no");
break;
}
i=i+1;
}
if(i==num)
{
printf("\n number is a prime number");
}
getch();
}