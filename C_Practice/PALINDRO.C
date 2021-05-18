#include<stdio.h>
#include<conio.h>
void main()
{
int n,reverse=0,rem,num;
clrscr();
printf("enter number");
scanf("%d",&n);
num=n;
while(n!=0)
{
rem=n%10;
reverse=reverse*10+rem;
n/=10;
}
if(reverse==num)
printf("\n %d is a palindrome number",num);
else
printf("\n %d is not a palindrome number",num);
getch();
}