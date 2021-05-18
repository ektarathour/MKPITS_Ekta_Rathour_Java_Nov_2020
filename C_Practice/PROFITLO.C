#include<stdio.h>
#include<conio.h>
void main()
{
int cp,sp,amt;
clrscr();
printf("enter cost price");
scanf("%d",&cp);
printf("enter selling price");
scanf("%d",&sp);
if(sp>cp)
{
amt=sp-cp;
printf("\n profit=%d",amt);
}
else
{
amt=cp-sp;
printf("\n loss=%d",amt);
}
getch();
}