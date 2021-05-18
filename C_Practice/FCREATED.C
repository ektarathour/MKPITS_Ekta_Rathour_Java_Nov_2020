//created a file using fopen fuction
#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp;
clrscr();
fp=fopen("c:/temp/myfile.txt","w");
printf("file created");
fclose(fp);
getch();
}