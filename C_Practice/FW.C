#include<stdio.h>
#include<conio.h>
void main()
{
FILE*fp;
char ch;
clrscr();
fp=fopen("c:/temp/sample.txt","w");
fprintf(fp,"this is simple txt \n");
fprintf(fp,"this is new sample text \n");
fclose(fp);
printf("\n data written to file");
getch();
}
