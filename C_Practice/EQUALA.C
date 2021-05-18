#include<stdio.h>
#include<conio.h>
void main()
{
int a[2][2],b[2][2];
int i,j,flag=0;
clrscr();
{
for(i=0;i<2;i++)
for(j=0;j<2;j++)
{
printf("\n enter the value for first  2d array \n");
scanf("%d",&a[i][j]);
}
for(i=0;i<2;i++)
for(j=0;j<2;j++)
{
printf("\n enter the value for 2d second array \n");
scanf("%d",&b[i][j]);
}
printf("\n first 2d array element are \n");
for(i=0;i<2;i++)
{
printf("\n");
for(j=0;j<2;j++)
printf("%d\t",a[i][j]);
}
printf("\n second 2d  array element  are \n");
for(i=0;i<2;i++)
{
printf("\n");
for(j=0;j<2;j++)
printf("%d\t",b[i][j]);
}
for(i=0;i<2;i++)
for(j=0;j<2;j++)
{
if (a[i][j]!=b[i][j])
flag=1;
}
if(flag==1)
printf("\n not identical");
else
printf("\n identical matrix");
}
}

