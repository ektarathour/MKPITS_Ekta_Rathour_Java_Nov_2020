//initialize array at the time of declaration
#include<stdio.h>
#include<conio.h>
void main()
{
int num[]={11,22,33};
int i;
clrscr();
for(i=0;i<3;i++)
{
printf("\n %d",num[i]);
}
getch();
}