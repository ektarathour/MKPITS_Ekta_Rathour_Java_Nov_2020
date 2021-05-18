//1)first 10 number sum and average
#include<stdio.h>
#include<conio.h>
void main()
{
int i,num,sum=0;
float avg;
clrscr();
{
printf("enter  10
 number\n");
scanf("%d",&num);
for(i=1;i<=10;i++)
{
sum=sum+i;
avg=sum%num;
printf("%d",i);
}
avg=sum/10.0f;
printf("\nthe sum is=%d",sum);
printf("\n the avg is =%f",avg);
getch();
}
}
