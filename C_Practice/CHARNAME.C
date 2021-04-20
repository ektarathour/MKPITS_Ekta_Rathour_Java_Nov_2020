//Write a program to accept a name from the user and disply it
#include<stdio.h>
#include<conio.h>
void main()
{
char name[10];
clrscr();
printf("enter your name");
scanf("%s",&name);
printf("\nname=%s",name);
getch();
}