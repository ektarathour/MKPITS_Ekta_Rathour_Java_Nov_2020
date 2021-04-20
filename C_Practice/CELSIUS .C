//calculate temprature in fahrenhite,celsiusus and kelvin
 #include<stdio.h>
 #include<conio.h>
 void main()
 {
 float celsius,fahr,kelvin;
 clrscr();
 printf("entertemprature in celsius");
 scanf("%f",&celsius);
fahr=1.8*celsius+32.0f;
kelvin=273.15+celsius;
 printf("\n fahr is=%.2f",fahr);
 printf("\n kelvin is=%.2f",kelvin);
 getch();
 }


