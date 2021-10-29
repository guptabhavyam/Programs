#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int main()
{
    char a[ 20 ] ;
    int i;
     printf("Enter the string\n");
     gets(a);
     printf("%s\n",a);

     for(i=0;a[i]!='\0';i++)
     {
         if( (a[i])=='a' || (a[i])=='e'|| (a[i])=='i' || (a[i])=='o' || (a[i])=='u' )
         {
             a[i]=toupper(a[i]);
         }

     }
       printf("%s\n",a);
     return 0;
}

