
#include <stdio.h>
#include <stdlib.h>

int main()
{

    int a[6];
 int b[6],c[6];
 int i,k,m;
 printf("Enter the array = \n");

    for(i=0;i<6;i++)
       {
                scanf("%d",&a[i]);

       }

 printf("\n");

    for(i=0;i<6;i++)
        {
            printf("%d",a[i]);

        }

 printf("\n");


        for(i=0,k=0,m=0;i<6;i++)
        {
              if( a[i]%2==0 )
                {
                 b[k]=a[i];
                 k++;

                }
                else
                {
                    c[m]=a[i];
                    m++;

                }
        }
   printf("\nThe array of even integer is");

        for(i=0;i< 6;i++)
        {
          printf(" %d",b[i]);

        }

    printf("\n The array of odd integer is");

        for(i=0;i<6;i++)
            {
              printf(" %d",c[i]);

           }




    return 0;
}
