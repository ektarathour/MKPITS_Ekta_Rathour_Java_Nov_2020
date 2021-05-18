#include<stdio.h>
#include<conio.h>
void show(struct emp);
struct emp
{
int no;
char name[20];
};
void main()
{
clrscr();
struct emp e1;
printf("enter employee no");
scanf("%d",&e1.no);
printf("enter employee name");
scanf("%s",&e1.name);
show(e1);
getch();
}
void show(struct emp e2)
{
printf("no=%d",e2.no);
printf("name=%s",e2.name);
}



