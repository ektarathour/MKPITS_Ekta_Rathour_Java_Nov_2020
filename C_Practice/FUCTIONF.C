#include<stdio.h>
#include<conio.h>
int fact(int);
int main()
{
int number;
clrscr();
printf("enter a number to calculate its factorial\n");
scanf("%d",&number);
fact=factorial(number);
printf("factorial of %d is: %d\n",number, fact);
return 0;
}
int fact(int n)
{
int i,factorial=1;
for(i=1;i<=n;i++)
{
factorial=factorial*i;
}
return (factorial);
}
