
#include <stdio.h>
#include <stdlib.h>

int main()
{
 int a[5];
 int i,j,k;
 printf("Enter the array = \n");
 for(i=0;i<5;i++)
   {
    scanf("%d",&a[i]);
   }
    for(i=0;i<5;i++)
   {
    printf("%d",a[i]);
   }
   j=a[0];
   k=a[0];
   for(i=0;i<5;i++)
   {
    if( a[i]>j )
     {
     k=j;
    j=a[i];
     }
     else
        if( a[i]>k && a[i]!=j )
     {
         k=a[i];
     }
   }
   printf("\nThe %d %d ",j,k);
   return 0;

}
