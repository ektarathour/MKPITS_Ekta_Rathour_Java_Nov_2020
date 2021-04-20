//a program to create an array to accept store salary of 5 employee store and total salary #include<stdio.h>
#include<conio.h>
void main()
{
int salary[5];
int i,total=0;
clrscr();
for(i=0;i<5;i++)
	{
	printf("enter salary of emplyoee");
	scanf("%d",&salary[i]);
	}
for(i=0;i<5;i++)
		{
		printf("\n salary %d=%d",i,salary[i]);
		total=total+salary[i];
		}
printf("\n total to=%d",total);
getch();
}
