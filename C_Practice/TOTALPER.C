#include<stdio.h>
#include<conio.h>
void main()
{
int rollno,mark,total,m1,m2,m3;
char name;
float percentage,div;
printf("enter roll number");
scanf("%d",rollno);
printf("enter mark");
scanf("%d",mark);
printf("enter name");
scanf("%s",name);
total= m1+m2+m3;
percentage=(float)total/300.0f;
if(mark>=60)
printf(" first division ");
else if(mark<=60&&mark>=48)
printf(" second division ");
else if(mark>=40&&mark<=33)
printf("pass");
else
printf("fail");
getch();
}

