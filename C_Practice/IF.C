#include<stdio.h>
#include<conio.h>
int main()
{
int num;
clrscr();
printf("enter number");
scanf("%d",&num);
if(num>10)
{
printf("\n num is greater then 10");
}
else
{
printf("\n num is less then 10");
}
getch();
return 0;
}