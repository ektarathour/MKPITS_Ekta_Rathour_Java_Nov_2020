#include<stdio.h>
#include<conio.h>
char*odd_even(int i);
int main()
{
int number;
clrscr();
printf("enter a number \n");
scanf("%d",&number);
printf("result:%s",odd_even(number));
return 0;
}
char*odd_even(int number)
{
if(number%2==0)
{
printf("%d is an even number\n",number);
}
else
{
printf("%d is an odd number \n",number);
}
getch();
}
