#include<stdio.h>
#include<conio.h>
void main()
{
int l,b,h,v;
clrscr();
printf("enterlength ");
scanf("%d",&l);
printf("enter breadth");
scanf("%d",&b);
printf("enter hight");
scanf("%d",&h);
v=l*b*h;
printf("volume=%d",v);
getch();
}