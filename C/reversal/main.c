
#include <stdio.h>
#include <stdlib.h>

int main()
{
 int a[5];
 int i,j,t;
 printf("Enter the array = \n");
 for(i=0;i<5;i++)
   {
    scanf("%d",&a[i]);
   }
    for(i=0;i<5;i++)
   {
    printf("%d",a[i]);
   }

   for(i=0,j=4;i<(5/2);i++,j--)
   {
     t=a[i];
     a[i]=a[j];
      a[j]=t;
    }
     for(i=0;i<5;i++)
   {
    printf("\n%d",a[i]);
   }

   return 0;

}
