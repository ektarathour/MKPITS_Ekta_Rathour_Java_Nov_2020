#include<stdio.h>
#include<conio.h>
void main()
{
int a[3]={10,7,9};
int i,j,temp;
clrscr();
for(i=0;i<3;i++)
{
for(j=i+1;j<3;j++)
{
if(a[i]>a[j])
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
}
}
}
printf("\narray of element in assending order are:");
for(i=0;i<3;i++)
{
printf("%d\t",a[i]);
}
getch();
}