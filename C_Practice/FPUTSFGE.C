#include<stdio.h>
#include<conio.h>
void main()
{
FILE*fp;
char ch;
char txt[300];
clrscr();
fp=fopen("c:/temp/puts.txt","w");
fputs("hello c programing",fp);
fclose(fp);
fp=fopen("c:/temp/sample1.txt","r");
printf("%s",fgets(txt,200,fp));
fclose(fp);
getch();
}