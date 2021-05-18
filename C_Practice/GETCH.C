#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
clrscr();
printf("enter character");
scanf("%c",&ch);
ch=getch();
printf("\nchar=%c",ch);
getch();
}