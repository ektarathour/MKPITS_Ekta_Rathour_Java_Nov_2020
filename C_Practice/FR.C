//a program read some text from file
#include<stdio.h>
#include<conio.h>
void main()
{
FILE*fp;
char buff[255];
clrscr();
fp=fopen("c:/temp/sample.txt","r");
while(fscanf(fp,"%s",&buff)!=EOF);
{
printf("%s\t",buff);
}
fclose(fp);
getch();
}
