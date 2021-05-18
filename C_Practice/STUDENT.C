#include<stdio.h>
#include<conio.h>
struct student
{
int rno,marks;
char name[10];
};
void main()
{
clrscr();
struct student stu;
printf("enter student name");
scanf("%s",&stu.name);
printf("enter student rno");
scanf("%d",&stu.rno);
printf("enter student marks");
scanf("%d",&stu.marks);
printf("%s\n",stu.name);
printf("%d\n",stu.rno);
printf("%d\n",stu.marks);
getch();
}
