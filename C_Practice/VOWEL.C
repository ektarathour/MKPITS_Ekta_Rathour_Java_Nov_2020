#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
clrscr();
printf("enter charater");
scanf("%c",&ch);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
printf("\n character is vowel");
else
printf("\n character is not vowel");
getch();
}