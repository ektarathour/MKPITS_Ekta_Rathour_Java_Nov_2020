#include<stdio.h>
#include<conio.h>
struct student
{
int rno;
char name[10];
};
void main()
{
struct student stu[5];
int i;
clrscr();
for(i=0;i<5;i++)
{
printf("enter rno");
scanf("%d",&stu[i].rno);
printf("enter name");
scanf("%s",&stu[i].name);
}
for(i=0;i<5;i++)
{
printf("\n rno=%d",stu[i].rno);
printf("\n name=%s",stu[i].name);
}
getch();
}