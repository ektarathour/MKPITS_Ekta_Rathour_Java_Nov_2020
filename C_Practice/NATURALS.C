//1)first 10 naural number sum
#include<stdio.h>
#include<conio.h>
void main()
{
int i,num,sum=0;
clrscr();
{
printf("enter first 10 natural number\n");
scanf("%d",&num);
for(i=1;i<=10;i++)
{
sum=sum+i;
printf("%d",i);
}
printf("\nthe sum is=%d",sum);
getch();
}
}
