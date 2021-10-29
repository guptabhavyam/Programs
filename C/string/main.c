
#include <stdio.h>

int main()
    {
        int i,j,f=0,d=0,max=0,h=0;
        char a[3][5];
        char g;
        int b[5];

        printf(" Enter the string \n");

        for(i=0;i<3;i++)
            {
             scanf("%s",a[i]);
            }

        fflush(stdin);

        printf("\nEnter the character to check: ");
        scanf("%c",&g);

        for( i=0 ; i<3 ; i++ )
            {
                for( j=0 ; a[i][j] != '\0' ; j++ )
                    {
                        if( a[i][j]==g )
                            {
                                f++;
                            }

                    }
                        b[d]=f;
                        d++;
                        f=0;
            }

        for (i=0;i<3;i++)
            {
                if( max<b[i] )
                {
                    max=b[i];
                    h=i;
                }

            }
            h++;

            printf("Row %d contain %c = %d",h,g,max);


        return 0;
}

