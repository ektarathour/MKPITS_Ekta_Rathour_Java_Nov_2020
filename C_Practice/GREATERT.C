#include<stdio.h>
#include<conio.h>
int main()
{
int num;
clrscr();
printf("enter namber");
scanf("%d",&num);
if(num>10)
{
printf(" num is greater then 10");
}
else
{
printf(" num is less then 10");
}
getch();
return 0;
}