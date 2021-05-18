#include<stdio.h>
#include<conio.h>
void showdata(struct emp)
struct emp
{
int no;
char name[10];
};
void main()
{
struct emp e1,eres;
clrscr();
eres=getdata(e1);
showdata(eres);
getch();
}
struct emp getdata(struct emp e)
{
printf("enter employee no and name");
scanf("%d%s",&e.no,&e.name);
return e;
}
void showdata(struct emp e)
{
printf("\n no=%d",e.no);
printf("\n name=%s",e.name);
}