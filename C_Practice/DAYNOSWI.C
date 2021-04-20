#include<stdio.h>
#include<conio.h>
void main()
{
int dayno;
clrscr();
printf("enter dayno (between 1 to 7)");
scanf("%d",&dayno);
switch(dayno)
{
case1:
printf("\n monday");
break;
case2:
printf("\n tuesday");
break;
case3:
printf("\n wednesday");
break;
case4:
printf("\n thursday");
break;
case5:
printf("\n friday");
break;
case6:
printf("\n satarday");
break;
case7:
printf("\n sunday");
break;
default:
printf("\n some other day");
break;
}
getch();
}