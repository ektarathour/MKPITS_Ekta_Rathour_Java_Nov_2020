//Create a 2 d array of 2 row and 4 column accept value from the user and store in array
#include<stdio.h>
#include<conio.h>
void main()
{
int arr[2][4];
int row,col;
clrscr();
for(row=0;row<2;row++)
{
for(col=0;col<4;col++)
{
printf("enter number");
scanf("%d",&arr[row][col]);
}
}
for(row=0;row<2;row++)
{
for(col=0;col<4;col++)
{
printf("%d\t",arr[row][col]);
}
printf("\n");
}
getch();
}