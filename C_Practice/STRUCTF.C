#include<stdio.h>
#include<conio.h>
#include<string.h>
struct emp
{
int no;
char name[20];
};
void show(struct emp e2)
{
printf("no=%d",e2.no);
printf("name=%s",e2.name);
}
void main()
{
struct emp e1;
clrscr();
e1.no=101;
strcpy(e1.name,"ekta");
show(e1);
getch();
}
