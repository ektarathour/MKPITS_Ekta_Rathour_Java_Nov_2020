//WAP to check digit is alphabates or digit or specil character
#include<stdio.h>
#include<conio.h>
void main()
{
char ch;
clrscr();
printf("enter any digit");
scanf("%c",&ch);
if(isalpha(ch))
	{
	printf("\n %c is an alphabat",ch);
	}
else if(isdigit(ch))
		{
		printf("\n %c is an digit",ch);
		}
else
			{
			printf("\n %c is an special character",ch);
			}
getch();
}










