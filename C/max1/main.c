#include <stdio.h>
#include <stdlib.h>
//#include "max1.c"

int main()
{
int i,j,k;
printf("Enter the numbers ");
scanf("%d%d", &i,&j);
swap(i,j);
printf("\nThe numbers are %d%d",i,j);
return 0;

}
