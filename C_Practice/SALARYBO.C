#include<stdio.h>
#include<conio.h>
void main()
{
float salary,bonus;
clrscr();
printf("enter salary");
scanf("%f",&salary);
if(salary>20000)
bonus=10000.0f;
else if(salary>10000)
bonus=5000.0f;
else
bonus==2000.0f;
printf("bonus==%f,salary==%f",bonus,salary);
getch();
}

