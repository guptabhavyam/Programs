#include <stdio.h>
#include <stdlib.h>

int main()
{
 int a[5];
 int i,sum1=0,sum2=0;
 printf("Enter the array  \n");
 for(i=0;i<5;i++)
   {
    scanf("%d",&a[i]);
   }
    for(i=0;i<5;i++)
   {
    printf("%d",a[i]);
   }

   for(i=0;i<5;i++)
   {
       if(a[i]%2==0)
       {
         sum1 = sum1+a[i];
        }

   }
  printf("\nThe sum all even in array is %d",sum1);

  for(i=0;i<5;i++)
  {
        if(i%2!=0)
        {
            sum2 = sum2+a[i];
        }
      }
   printf("\nThe sum of all at odd index is %d",sum2);
   return 0;
}
