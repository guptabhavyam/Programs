#include <stdio.h>

int main()
    {
        int i,j,f=0;
        char a[50];
        char b[50];

        fflush(stdin);

        printf(" Enter the string \n");
        scanf("\t%s",a);

        printf(" Enter the string \n");
        scanf("\t%s",b);

        fflush(stdin);

                   for( i=0 ; i<5 ; i++ )
                    {

                    }
                    printf("%d\n",i);

            for( j=0; i<12,j<5 ; i++,j++ )
                {
                  if(f==0)
                     {
                        a[i]=' ';
                        i++;
                        f=1;
                    }
                  a[i]=b[j];
                }
                printf("%d\n",i);
                a[i]='\0';

            printf("%s",a);

        return 0;

}
