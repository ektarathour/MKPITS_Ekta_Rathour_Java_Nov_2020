#include<stdio.h>
#include<conio.h>
struct book
{
char title[50],author[20];
int price;
};
void main()
{
struct book b1;
clrscr();
printf("enter book title\n");
scanf("%s",&b1.title);
printf("enter book author\n");
scanf("%s",&b1.author);
 printf("enter book price\n");
scanf("%d",&b1.price);
printf("%s",b1.title);
printf("%s",b1.author);
printf("%d",b1.price);
getch();
}


