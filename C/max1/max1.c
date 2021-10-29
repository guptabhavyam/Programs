
#include<stdio.h>

void swap(int p,int q)
{
    int a;
    printf("\nbefore swapping %d%d",p,q);
    a=p;
    p=q;
    q=a;
    printf("\nafter swapping %d%d",p,q);

}


