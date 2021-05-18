#include<stdio.h>
#include<conio.h>{
void main()
{
int i,j,no=0;
clrscr();
{
for(i=1;i<=5;i++)
{
for(j=1;j<=i;j++)
{
no++;
printf("%d\t",no);
}
printf("\n");
}
getch();
}
}
