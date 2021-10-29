#include <stdio.h>

int main()
    {
        int i,p=5,f=0;
        char a[5];
        char g,t;

        fflush(stdin);

        printf(" Enter the string \n");
        scanf("%s",a);

        fflush(stdin);

        printf("\nEnter the character to remove ");
        scanf("%c",&g);

        for( i=0 ; a[i] != '\0' ; i++ )
                    {
                        if( a[i]==g )
                            {
                               p=i;
                               break;
                            }
                    }

        if (p!=5)
            {
                for(i=0;a[i]!='\0';i++)
                    {
                        if( i==p )
                            {
                             a[i]=' ';
                             f=1;
                            }
                         if ( f==1)
                         {
                             t=a[i];
                             a[i]=a[i+1];
                             a[i+1]=t;
                             printf("\n%d\n",i);
                         }

                    }
               printf("\n%d\n",i);
                for(i=0;i<5;i++);
                    {
                        if(a[i]==' ')
                            {
                              printf("%d\n",i);
                                a[i]='\0';
                            }
                            printf("%d\n",i);
                    }
                    printf("%d\n",i);
              }
            else
            {
                printf("The character not present");
            }
             fflush(stdin);
        printf("%s",a);
        return 0;

}
