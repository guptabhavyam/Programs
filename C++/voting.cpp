#include<stdio.h>
#include<stdlib.h>

 int main()
    {
        int i;
        printf("Enter your age");
        scanf("%d",&i);

        if(i>=18)
            {
                printf("You are eligible to vote");
            }
        else
            {
                printf("You are not eligible to vote");
            }
        return 0;
 }
