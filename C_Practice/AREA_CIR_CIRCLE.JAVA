//Write a program to accept redius of circle then disply the area of circle and circumference 
#include<stdio.h>
#include<conio.h>
void main()
{
float r,area,circ;
printf("enter radius of circle");
scanf("%f",&r);
area=3.14f*r*r;
circ=2*3.14f*r;
printf("\n area=%f",area);
printf("\n circ=%f",circ);
getch();
}
