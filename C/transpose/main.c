#include <stdio.h>
#include <stdlib.h>

int main()
{

    int a[3][3];
 int i,j,t;
 printf("Enter the array = \n");

    for(i=0;i<3;i++)
   {
        for(j=0;j<3;j++)
            {
                scanf("%d",&a[i][j]);
            }
   }
 printf("\n");
    for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                printf("%d",a[i][j]);
            }
            printf("\n");
        }

 printf("\n");
        for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                if(  i!=j && i<j )
                {
                    t=a[i][j];
                    a[i][j]=a[j][i];
                    a[j][i]=t;

                }
            }
        }
 printf("\n");
     for(i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                printf("%d",a[i][j]);
            }
            printf("\n");
        }
                    return 0;
}
