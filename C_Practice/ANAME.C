//a program to create an ch aracter array of  element to store your name 
#include<stdio.h>
#include<conio.h>
void main()
{
char fname[10];
clrscr();
//displying value from array element
printf("enter your name");
printf("%s",&fname);
printf("\n your name is %s",fname);
getch();
}
