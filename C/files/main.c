#include <stdio.h>
#include <stdlib.h>

int main()
{
    char a[50];
    int i;
    FILE *fp;
    fp = fopen("text file.txt","r");
    if ( fp == NULL )
        printf("Error");
    else
    {
        printf("Success");
      while(fgets(a,50,fp) != NULL)
      {
            printf("\n%s",a);
      }
       printf("Using scanf");
       while(fscanf(fp,"%s",a)!= NULL);
         printf("\n%s",a);



    fclose(fp);

    }
    return 0;
}
