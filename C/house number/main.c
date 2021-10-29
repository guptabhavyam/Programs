#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    char a[15] ;
    int i,j;
    char b[5];
     printf("Enter the string\n");
     gets(a);
     printf("%s\n",a);

     fflush(stdin);

     for( i=0 ,j=0 ; a[i]!='\0' ; i++ )
     {
          if( isdigit(a[i])!=0  )
         {
             b[j]=a[i];
             j++;
         }

     }

     for(i=0;i<5;i++)
     {
         printf("%c",b[i]);
     }

     return 0;
}
