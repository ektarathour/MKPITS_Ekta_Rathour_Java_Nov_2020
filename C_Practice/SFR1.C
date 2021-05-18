#include<stdio.h>
#include<conio.h>
void printbook(struct book);
struct book
{
int bookid;
float bookprice;
char bookname[20],bookauthor[20];
}b1,b2;
void main()
{
clrscr();
printf("enter id,price,name and author of the  first book");
scanf("%d%f%s%s",&b1.bookid,&b1.bookprice,&b1.bookname,&b1.bookauthor);
printf("enter id,price,name and author of the second book");
scanf("%d%f%s%s",&b2.bookid,&b2.bookprice,&b2.bookname,&b2.bookauthor);
printbook(b1);
printbook(b2);
getch();
}
void printbook(struct book b)
{
printf("\n bookid=%d",b.bookid);
printf("\n bookprice=%f",b.bookprice);
printf("\n bookname=%s",b.bookname);
printf("\n bookauthor=%s",b.bookauthor);
}





