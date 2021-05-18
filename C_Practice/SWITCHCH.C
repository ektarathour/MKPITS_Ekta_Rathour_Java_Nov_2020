#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
clrscr();
printf("enter the chracter");
scanf("%c",&ch);
switch(ch)
{
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
printf("\n character is vowel");
break;
default:
printf("\n character is not vowel");
break;
}
getch();
}
