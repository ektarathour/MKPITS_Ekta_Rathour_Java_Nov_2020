#include<stdio.h>
#include<conio.h>
void main()
{
int m1,m2,m3,total;
float percentage;
clrscr();
printf("enter three subject marks");
scanf("%f%f%f",&m1,&m2,&m3);
total=m1+m2+m3;
percentage=(float)(total/300.0f)*100.0f;
printf("\n total mark=%d",total);
printf("\n percentage=%f",percentage);
getch();
}
