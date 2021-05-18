struct emp
{
char name[20],designation[20];
int  no,salary;
};
void main()
{
struct emp e1;
clrscr();
printf("enter empname\n");
scanf("%s",&e1.name);
printf("enter empno\n");
scanf("%d",&e1.no);
printf("enter empsalary\n");
scanf("%d",&e1.salary);
printf("enter designation\n");
scanf("%s",&e1.designation);
printf("%s",e1.name);
printf("%d",e1.no);
printf("%d",e1.salary);
printf("%s",e1.designation);
getch();
}



