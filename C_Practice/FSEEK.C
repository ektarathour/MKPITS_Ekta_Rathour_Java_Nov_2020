#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp;
fp=fopen("c:/temp/fseek.txt","w");
fputs("welcome to c",fp);
fseek(fp,7,SEEK_SET);
fputs("ekta",fp);
fclose(fp);
getch();
}