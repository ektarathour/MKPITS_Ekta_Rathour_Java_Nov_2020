#include<stdio.h>
#include<conio.h>
int main()
{
int num;
clrscr();
printf("enter namber");
scanf("%d",&num);
if(num%2==0)
{
printf(" num is even");
}
else
{
printf(" num is odd");
}
getch();
return 0;
}