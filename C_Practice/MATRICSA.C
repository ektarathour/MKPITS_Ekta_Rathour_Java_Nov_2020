#include<stdio.h>
#include<conio.h>
void main()
{
int arr[3][3]={{1,2,3,},{4,5,6},{7,8,9}};
int i ,j;
clrscr();
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
printf("enter number");
scanf("%d",arr[i][j]);
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
printf("%d\t",arr[i][j]);
}
printf("\n");
}
getch();
}