#include<stdio.h>
#include<conio.h>
void main()
{
FILE *fp;
int storeid;
char name[10];
int salary;
clrscr();
printf("enter storeid,name,salary");
scanf("%d%s%d",&storeid,&name,&salary);
fp=fopen("c:/temp/exp.txt","a");
fprintf(fp,"\n employee datail:");
fprintf(fp,"\n storeid %d",storeid) ;
fprintf(fp,"\n name %s",name) ;
fprintf(fp,"\n salary %d",salary);
fclose(fp);
getch();
}
