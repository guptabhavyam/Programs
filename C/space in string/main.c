#include <stdio.h>
#include<string.h>
#include<ctype.h>

int main()
{
     int i,c=1;
        char a[20];

        fflush(stdin);

        printf(" Enter the string \n");
        gets(a);

        fflush(stdin);

        puts(a);

        for( i=0; a[i]!='\0' ; i++ )
                {
                     if( isspace(a[i]))
                     {
                      c++;
                     }
                }

printf("\nThe no. of words are %d",c);


}
