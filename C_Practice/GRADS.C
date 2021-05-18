#include<stdio.h>
#include<conio.h>
void main()
{
char grd;
clrscr();
printf("enter grade");
scanf("%c",&grd);
switch(grd)
{
case 'E':
printf("excellence\n");
break;
case 'V':
printf("very good\n");
break;
case 'G':
printf("good\n");
break;
case 'A':
printf("averag \n");
break;
default:
printf("invalid grade");
break;
}
getch();
}












