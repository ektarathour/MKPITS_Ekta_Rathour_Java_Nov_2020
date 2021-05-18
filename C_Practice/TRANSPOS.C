#include<stdio.h>
#include<conio.h>
void main()
{
int i,j, mat[row][col],trans_mat[col[row],row,col;
clrscr();
printf("\ enter matrics \n");
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
scanf("%d",&mat[i][j]);
}
}
for(i=0;i<row;i++)
{
for(j=0;j<col;j++)
{
trans_mat[j][i]=mat[i][j];
}
}
printf("transpose matrics\n");
for(i=0;i<col;i++)
{
for(j=0;j<row;j++)
{
printf("%d",trans_mat[i][j]) ;
}
printf("\n");
}
getch();
}