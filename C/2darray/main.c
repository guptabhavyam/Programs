
#include <stdio.h>
#include <stdlib.h>

int main()
{
int a[2][5];
 int i,j,sum =0;
 printf("Enter the array = \n");

    for(i=0;i<2;i++)
   {
        for(j=0;j<5;j++)
            {
                scanf("%d",&a[i][j]);
            }
   }

    for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
                printf("\n%d",a[i][j]);
            }
        }


        for(i=0;i<2;i++)
        {
            for(j=0;j<5;j++)
            {
               sum=sum+a[i][j];

            }
            printf("\n%d",sum);
            sum=0;

        }

   return 0;
}
