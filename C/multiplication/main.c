#include <stdio.h>

int multiply(int p,int q)
{
    if (q == 0)
    {
        return 0;
    }
    return p+multiply(p,q-1);
}

int main()
{
   int m,n,l;
   printf("Enter the number ");
   scanf("%d",&m);
   printf("Enter the no. of times to be multiplied ");
   scanf("%d",&n);
   l=multiply(m,n);
   printf("The output is %d",l);
   return 0;
}
