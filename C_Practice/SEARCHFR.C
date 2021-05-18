//search element from array
#include<stdio.h>
#include<conio.h>
void main()
{
int num[]={11,22,33} ;
int n,i;
clrscr();
printf("enter number to be searched");
scanf("%d",&n);
for(i=0;i<3;i++)
{
if(n==num[i])
{
printf("\n number found at position %d",i);
break;
}
}
if(i==3)
{
printf("\n number is not found in an array");
}
getch();
}