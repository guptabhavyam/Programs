#include <stdio.h>
#include <stdlib.h>

struct library
    {
        char name[20];
        int n;
        float p;
    };


int main()
    {
        int i;
        struct library s[5];
         for(i=0;i<5;i++)
            {
                printf("The Name , Number of page , Price = \n");
                scanf("%s %d %f",s[i].name , &s[i].n , &s[i].p);
            }

            fflush(stdin);

            int max=0;

        for(i=0;i<5;i++)
            {
                if( max < s[i].n )
                    {
                        max = s[i].n;
                    }
            }

            printf("%d\n",max );

        return 0;

}
