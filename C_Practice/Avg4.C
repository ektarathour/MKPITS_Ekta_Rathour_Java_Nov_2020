//a program to calculate average of four number
 #include<stdio.h>
 #include<conio.h>
 void main()
 {
 int num1,num2,num3,num4;
 float avg;
 clrscr();
 printf("enter 4 number");
 scanf("%d%d%d%d",&num1,&num2,&num3,num4);
avg=(float)(num1+num2+num3+num4)/4;
 printf("\n avg of %d and %d is=%.2f",avg);
 getch();
 }


