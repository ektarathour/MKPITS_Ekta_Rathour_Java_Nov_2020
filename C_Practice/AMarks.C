//program to total,and percent using array
#include<stdio.h>
#include<conio.h>
void main()
{
int marks[5];//array of 5 element
int i;
int total=0;
float per;
clrscr();
//storing value in array element
for(i=0;i<=5;i++)
{
printf("\n enter marks");
scanf("%d",&marks[i]);
}
//displying value from array
for(i=0;i<5;i++)
{
printf("\n marks[%d]=%d",i,marks[i]);
total=total+marks[i];
}
printf("\n total marks=%d",total);
per=(float)(total/500.0f)*100.0f;
printf("\n percentage=%.2f",per);
getch();
}
