#include<stdio.h>
#include<conio.h>
int main()
{
int i;
int a[]={1,3,4,2,5,6,9,8};
int n=9;
int total=0,sum=0;
total=(n*(n+1))/2;
for(i=0;i<n;i++)
{
sum=sum+a[i];
}
printf("missing number is %d",total,sum);
return 0;
}