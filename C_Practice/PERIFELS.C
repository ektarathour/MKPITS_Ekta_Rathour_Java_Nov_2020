#include<stdio.h>
#include<conio.h>
void main()
{
int m1,m2,m3,total;
float per;
clrscr();
printf("enter 3 subject mark");
scanf("%d%d%d",&m1,&m2,&m3);
total=m1+m2+m3;
per=(float)(total/300.0f)*100.0f;
printf("\n total=%d",total);
printf("\n per=%f",per);
if(per>=75)
printf("\n grade=dist");
else if(per>=60&&per<75)
printf("\n grade=first");
else if(per>=40&&per<60)
printf("\n grade=second");
else
printf("\n fail");
getch();
}


