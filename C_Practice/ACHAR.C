//store character from the user
#include<stdio.h>
#include<conio.h>
void main()
{
char fname[5];
int i;
clrscr();
for(i=0;i<5;i++)
		{
		printf("enter character");
		fflush(stdin);
		scanf("%c",&fname[i]);
		}
for(i=0;i<5;i++)
		{
		printf("\n char=%c",fname[i]);
		}
getch();
}