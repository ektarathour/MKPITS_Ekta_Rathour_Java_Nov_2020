#include<stdio.h>
#include<conio.h>
struct customer
{
int id;
char name[20],address[50];
};
void main()
{
clrscr();
struct customer c1;
printf("enter customer name\n");
scanf("%s",&c1.name);
printf("enter customer id\n");
scanf("%d",&c1.id);
printf("enter customer address\n");
scanf("%s",&c1.address);
printf("%s",c1.name);
printf("%d",c1.id);
printf("%s",c1.address);
getch();
}

