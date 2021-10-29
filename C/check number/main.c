#include <stdio.h>
#include <stdlib.h>

int main()
{
     int a[5];
 int i,j,k=0;
 printf("Enter the array = \n");
 for(i=0;i<5;i++)
   {
    scanf("%d",&a[i]);
   }
    for(i=0;i<5;i++)
   {
    printf("%d",a[i]);
   }
   printf("\nEnter the number to check\n");
   scanf("%d",&j);
   for(i=0;i<5;i++)
   {
       if(a[i]==j)
       {
           k=1;
       }
   }
   if(k==1)
   {
       printf("\nThe number is present ");
   }
   else
   {
     printf("\nThe number is not present");
   }
return 0;
}

