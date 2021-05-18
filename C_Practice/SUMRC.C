#include<stdio.h>
#include<conio.h>
void main()
{
int i,j,row,col,a[10][10],sum=0;
clrscr();
printf("enter number of row and column:");
scanf("%d%d",&i,&j);
printf("enter the matrix element\n");
for(row=0;row<i;row++)
{
for(col=0;col<j;col++)
{
scanf("%d",&a[row][col]);
}
}
for(row=0;row<i;row++)
{
sum=0;
for(col=0;col<j;col++)
{
sum=sum+a[row][col];
}
printf("sum of element of row is=%d \n",sum);
}
for(row=0;row<i;row++)
{
sum=0;
for(col=0;col<j;col++)
{
sum=sum+a[col][row];
}
printf("sum of element of column is=%d \n",sum);
getch();
}
}
