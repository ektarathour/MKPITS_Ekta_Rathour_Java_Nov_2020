#include<stdio.h>
#include<conio.h>
void main()
{
int hight;
clrscr();
printf("enter the hight of the person");
scanf("%f",&hight);
if(hight<150.0)
printf("person is short\n");
else if((hight>=150.0)&&(hight<=160.0))
printf("person is average\n");
else if((hight>=160.0)&&(hight<=170.0))
printf("person is taller\n");
else
printf("person is abnormal\n");
getch();
}