//1) multiplication table of  given an integer
#include<stdio.h>
#include<conio.h>
void main()
{
int i,n;
clrscr();
{
printf("enter odd natural number\n");
scanf("%d",&n);
printf("\n");
for(i=1;i<=10;i++)
{
printf("%d*%d=%d\n",n,i,i*n);
}
getch();
}
}