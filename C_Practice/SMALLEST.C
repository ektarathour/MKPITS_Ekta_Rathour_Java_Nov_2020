#include<stdio.h>
#include<conio.h>
int main()
{
int num1,num2,num3;
clrscr();
printf("enter three number");
scanf("%d%d%d",&num1,&num2,num3);
if(num1<num2&&num1<num3)
{
printf("num1 is smallest number");
}
else if(num2<num3)
{
printf("num2 is smallest number");
}
else
{
printf("num3 is smallest number");
}
getch();
return 0;
}
