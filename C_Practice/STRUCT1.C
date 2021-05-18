#include<stdio.h>
#include<conio.h>
struct product
{
char prodname[20];
float price;
};
void main()
{
clrscr();
struct product prod1;
printf("enter prodname");
scanf("%s",&prod1.prodname);
printf("%s",prod1.prodname);
printf("enter price");
scanf("%f",&prod1.price);
printf("%f",prod1.price);
getch();
}