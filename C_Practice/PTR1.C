#include<stdio.h>
#include<conio.h>
void main()
{
int num=10;
int*ptr=&num;
clrscr();
printf("\n value stored in num variable=%d",num);
printf("\n addres of variable in ptr variable=%u",ptr);
printf("\n value stored at addres of ptr variable=%d",*ptr);
getch();
}